/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.kdoc

import org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase
import org.jetbrains.kotlin.idea.test.KotlinLightProjectDescriptor
import org.jetbrains.kotlin.idea.test.InTextDirectivesUtils
import java.io.File

abstract class AbstractKDocTypingTest : KotlinLightCodeInsightFixtureTestCase() {
    override fun getProjectDescriptor() = KotlinLightProjectDescriptor.INSTANCE

    protected fun doTest(fileName: String) {
        val file = File(fileName).relativeTo(File(testDataPath))
        myFixture.configureByFile(file.path)
        val textToType = InTextDirectivesUtils.findStringWithPrefixes(myFixture.file.text, "// TYPE:")
        if (textToType == null) {
            throw IllegalArgumentException("Cannot find directive TYPE in input file")
        }
        myFixture.type(textToType)
        myFixture.checkResultByFile(file.path + ".after")
    }
}
