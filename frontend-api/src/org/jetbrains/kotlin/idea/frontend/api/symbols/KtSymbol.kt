/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.frontend.api.symbols

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.idea.frontend.api.ValidityTokenOwner
import org.jetbrains.kotlin.idea.frontend.api.symbols.pointers.KtSymbolPointer

interface KtSymbol : ValidityTokenOwner {
    val origin: KtSymbolOrigin

    /**
     * [PsiElement] which corresponds to given [KtSymbol]
     * If [origin] is one of [KtSymbolOrigin.SOURCE], [KtSymbolOrigin.JAVA], [KtSymbolOrigin.LIBRARY] then the source is not null
     * For other [KtSymbolOrigin] behaviour is undefined
     *
     * For [KtSymbolOrigin.LIBRARY] the generated by Kotlin class file source element is returned
     */
    val psi: PsiElement?

    fun createPointer(): KtSymbolPointer<KtSymbol>
}

/**
 * Get symbol [PsiElement] if its type is [PSI], otherwise throws ClassCastException
 *
 * @see KtSymbol.psi
 */
inline fun <reified PSI : PsiElement> KtSymbol.psi(): PSI =
    psi as PSI

/**
 * Get symbol [PsiElement] if its type is [PSI], otherwise null
 *
 * @see KtSymbol.psi
 */
inline fun <reified PSI : PsiElement> KtSymbol.psiSafe(): PSI? =
    psi as? PSI

/**
 * A place where [KtSymbol] came from
 */
enum class KtSymbolOrigin {
    /**
     * Declaration from Kotlin sources
     */
    SOURCE,

    /**
     * Declaration which do not have it's PSI source and was generated, they are:
     * For data classes the `copy`, `component{N}`, `toString`, `equals`, `hashCode` functions are generated
     * For enum classes the `valueOf` & `values` functions are generated
     * For lambda the `it` property is generated
     */
    SOURCE_MEMBER_GENERATED,

    /**
     * A Kotlin declaration came from some .class file
     */
    LIBRARY,

    /**
     * A Kotlin declaration came from some Java source file or from some Java library
     */
    JAVA,

    SAM_CONSTRUCTOR,

    /**
     * Consider the following code:
     * ```
     * interface A { fun x() }
     * interface B { fun x() }
     *
     * interface C : A, B
     * ```
     * The intersection of functions A.foo & B.foo will create a function C.foo which will be marked with [INTERSECTION_OVERRIDE]
     */
    INTERSECTION_OVERRIDE,

    /**
     * Member symbol which was generated by compiler when using `by` interface delegation
     * e.g,
     * ```
     * interface A { fun x() }
     * class B(a: A) : A by a
     * ```
     * the `B.foo` function will be generated by Kotlin compiler
     */
    DELEGATED,


    JAVA_SYNTHETIC_PROPERTY,

    /**
     * Declaration is backing field of some member property
     * A symbol kind of [KtBackingFieldSymbol]
     *
     * @see KtBackingFieldSymbol
     */
    PROPERTY_BACKING_FIELD,
}