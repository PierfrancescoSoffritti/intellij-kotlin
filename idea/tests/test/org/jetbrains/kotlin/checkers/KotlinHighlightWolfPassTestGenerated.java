/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.idea.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.idea.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("idea/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/checker/wolf")
public class KotlinHighlightWolfPassTestGenerated extends AbstractKotlinHighlightWolfPassTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("diagnostic.kt")
    public void testDiagnostic() throws Exception {
        runTest("testData/checker/wolf/diagnostic.kt");
    }

    @TestMetadata("diagnosticAfterSyntax.kt")
    public void testDiagnosticAfterSyntax() throws Exception {
        runTest("testData/checker/wolf/diagnosticAfterSyntax.kt");
    }

    @TestMetadata("none.kt")
    public void testNone() throws Exception {
        runTest("testData/checker/wolf/none.kt");
    }

    @TestMetadata("syntax.kt")
    public void testSyntax() throws Exception {
        runTest("testData/checker/wolf/syntax.kt");
    }
}
