/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion

import com.intellij.codeInsight.completion.*
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PsiJavaPatterns
import com.intellij.util.ProcessingContext
import org.jetbrains.kotlin.idea.caches.project.getModuleInfo
import org.jetbrains.kotlin.idea.completion.checkers.CompletionVisibilityChecker
import org.jetbrains.kotlin.idea.completion.checkers.ExtensionApplicabilityChecker
import org.jetbrains.kotlin.idea.completion.context.FirBasicCompletionContext
import org.jetbrains.kotlin.idea.completion.context.FirNameReferencePositionContext
import org.jetbrains.kotlin.idea.completion.context.FirPositionCompletionContextDetector
import org.jetbrains.kotlin.idea.completion.context.FirUnknownPositionContext
import org.jetbrains.kotlin.idea.completion.contributors.FirCallableCompletionContributor
import org.jetbrains.kotlin.idea.completion.contributors.FirClassifierCompletionContributor
import org.jetbrains.kotlin.idea.completion.contributors.FirContextCompletionContributorBase
import org.jetbrains.kotlin.idea.completion.contributors.FirKeywordCompletionContributor
import org.jetbrains.kotlin.idea.completion.weighers.Weighers
import org.jetbrains.kotlin.idea.fir.low.level.api.IndexHelper
import org.jetbrains.kotlin.idea.fir.low.level.api.util.originalKtFile
import org.jetbrains.kotlin.idea.frontend.api.KtAnalysisSession
import org.jetbrains.kotlin.idea.frontend.api.components.KtScopeContext
import org.jetbrains.kotlin.idea.frontend.api.scopes.KtCompositeScope
import org.jetbrains.kotlin.idea.frontend.api.scopes.KtScope
import org.jetbrains.kotlin.idea.frontend.api.symbols.*
import org.jetbrains.kotlin.idea.frontend.api.types.KtClassType
import org.jetbrains.kotlin.idea.frontend.api.types.KtType
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.*

class KotlinFirCompletionContributor : CompletionContributor() {
    init {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(), KotlinFirCompletionProvider)
    }
}

private object KotlinFirCompletionProvider : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {
        if (shouldSuppressCompletion(parameters, result.prefixMatcher)) return

        val resultSet = createResultSet(parameters, result)
        val indexHelper = IndexHelper(
            parameters.position.project,
            parameters.position.getModuleInfo().contentScope()
        )

        val basicContext = FirBasicCompletionContext.createFromParameters(parameters, resultSet) ?: return
        recordOriginalFile(basicContext)
        val positionContext = FirPositionCompletionContextDetector.detect(basicContext)

        val keywordContributor = FirKeywordCompletionContributor(basicContext)

        FirPositionCompletionContextDetector.analyseInContext(basicContext, positionContext) {
            with(keywordContributor) { completeKeywords(positionContext) }
            when (positionContext) {
                is FirNameReferencePositionContext -> {
                    val visibilityChecker = CompletionVisibilityChecker {
                        parameters.invocationCount > 1 || isVisible(
                            it,
                            basicContext.originalKtFile.getFileSymbol(),
                            positionContext.explicitReceiver,
                            positionContext.position
                        )
                    }

                    with(FirCallableCompletionContributor(basicContext, indexHelper)) {
                        complete(positionContext, visibilityChecker)
                    }

                    if (positionContext.explicitReceiver == null) {
                        with(FirClassifierCompletionContributor(basicContext, indexHelper)) {
                            collectTypesCompletion(
                                basicContext.originalKtFile.getScopeContextForPosition(positionContext.nameExpression).scopes,
                                visibilityChecker
                            )
                        }
                    }

                }
                is FirUnknownPositionContext -> {
                }
            }
        }
    }


    private fun recordOriginalFile(basicCompletionContext: FirBasicCompletionContext) {
        val originalFile = basicCompletionContext.originalKtFile
        val fakeFile = basicCompletionContext.fakeKtFile
        fakeFile.originalKtFile = originalFile
    }

    private fun createResultSet(parameters: CompletionParameters, result: CompletionResultSet): CompletionResultSet =
        result.withRelevanceSorter(createSorter(parameters, result))

    private fun createSorter(parameters: CompletionParameters, result: CompletionResultSet): CompletionSorter =
        CompletionSorter.defaultSorter(parameters, result.prefixMatcher)
            .let(Weighers::addWeighersToCompletionSorter)

    private val AFTER_NUMBER_LITERAL = PsiJavaPatterns.psiElement().afterLeafSkipping(
        PsiJavaPatterns.psiElement().withText(""),
        PsiJavaPatterns.psiElement().withElementType(PsiJavaPatterns.elementType().oneOf(KtTokens.FLOAT_LITERAL, KtTokens.INTEGER_LITERAL))
    )
    private val AFTER_INTEGER_LITERAL_AND_DOT = PsiJavaPatterns.psiElement().afterLeafSkipping(
        PsiJavaPatterns.psiElement().withText("."),
        PsiJavaPatterns.psiElement().withElementType(PsiJavaPatterns.elementType().oneOf(KtTokens.INTEGER_LITERAL))
    )

    private fun shouldSuppressCompletion(parameters: CompletionParameters, prefixMatcher: PrefixMatcher): Boolean {
        val position = parameters.position
        val invocationCount = parameters.invocationCount

        // no completion inside number literals
        if (AFTER_NUMBER_LITERAL.accepts(position)) return true

        // no completion auto-popup after integer and dot
        if (invocationCount == 0 && prefixMatcher.prefix.isEmpty() && AFTER_INTEGER_LITERAL_AND_DOT.accepts(position)) return true

        return false
    }
}
