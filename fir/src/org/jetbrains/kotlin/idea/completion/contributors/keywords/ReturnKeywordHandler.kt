/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.contributors.keywords

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.openapi.project.Project
import org.jetbrains.kotlin.idea.completion.CompletionKeywordHandler
import org.jetbrains.kotlin.idea.completion.createKeywordElement
import org.jetbrains.kotlin.idea.completion.createKeywordElementWithSpace
import org.jetbrains.kotlin.idea.completion.labelNameToTail
import org.jetbrains.kotlin.idea.frontend.api.KtAnalysisSession
import org.jetbrains.kotlin.idea.frontend.api.symbols.KtFunctionSymbol
import org.jetbrains.kotlin.idea.frontend.api.types.KtType
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.findLabelAndCall
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.name.StandardClassIds
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.parentsWithSelf

internal object ReturnKeywordHandler: CompletionKeywordHandler<KtAnalysisSession>(KtTokens.RETURN_KEYWORD) {
    @OptIn(ExperimentalStdlibApi::class)
    override fun KtAnalysisSession.createLookups(
        parameters: CompletionParameters,
        expression: KtExpression?,
        lookup: LookupElement,
        project: Project
    ): Collection<LookupElement> {
        if (expression == null) return emptyList()
        val result = mutableListOf<LookupElement>()

        for (parent in expression.parentsWithSelf.filterIsInstance<KtDeclarationWithBody>()) {
            val returnType = parent.getReturnKtType()
            if (parent is KtFunctionLiteral) {
                val (label, call) = parent.findLabelAndCall()
                if (label != null) {
                    addAllReturnVariants(result, returnType, label)
                }

                // check if the current function literal is inlined and stop processing outer declarations if it's not
                if (!isInlineFunctionCall(call)) {
                    break
                }
            } else {
                if (parent.hasBlockBody()) {
                    addAllReturnVariants(result, returnType, label = null)
                }
                break
            }
        }

        return result
    }

    private fun KtAnalysisSession.addAllReturnVariants(result: MutableList<LookupElement>, returnType: KtType, label: Name?) {
        val isUnit = returnType.isUnit
        result.add(createKeywordElementWithSpace("return", tail = label?.labelNameToTail().orEmpty(), addSpaceAfter = !isUnit))
        getExpressionsToReturnByType(returnType).mapTo(result) { returnTarget ->
            createKeywordElement("return", tail = "${label.labelNameToTail()} $returnTarget")
        }
    }

    @OptIn(ExperimentalStdlibApi::class)
    private fun KtAnalysisSession.getExpressionsToReturnByType(returnType: KtType): List<String> = buildList {
        if (returnType.canBeNull) {
            add("null")
        }

        fun emptyListShouldBeSuggested(): Boolean =
            returnType.isClassTypeWithClassId(StandardClassIds.Collection)
                || returnType.isClassTypeWithClassId(StandardClassIds.List)
                || returnType.isClassTypeWithClassId(StandardClassIds.Iterable)

        when {
            returnType.isClassTypeWithClassId(StandardClassIds.Boolean) -> {
                add("true")
                add("false")
            }
            emptyListShouldBeSuggested() -> {
                add("emptyList()")
            }
            returnType.isClassTypeWithClassId(StandardClassIds.Set) -> {
                add("emptySet()")
            }
        }
    }

    private fun KtAnalysisSession.isInlineFunctionCall(call: KtCallExpression?): Boolean {
        val callee = call?.calleeExpression as? KtReferenceExpression ?: return false
        return (callee.mainReference.resolveToSymbol() as? KtFunctionSymbol)?.isInline == true
    }
}