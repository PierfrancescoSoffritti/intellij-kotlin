/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.low.level.api.sessions;

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
@TestRoot("fir-low-level-api-ide-impl")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/sessionInvalidation")
public class SessionsInvalidationTestGenerated extends AbstractSessionsInvalidationTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("binaryTree")
    public void testBinaryTree() throws Exception {
        runTest("testData/sessionInvalidation/binaryTree/");
    }

    @TestMetadata("binaryTreeNoInvalidated")
    public void testBinaryTreeNoInvalidated() throws Exception {
        runTest("testData/sessionInvalidation/binaryTreeNoInvalidated/");
    }

    @TestMetadata("binaryTreeWithAdditionalEdge")
    public void testBinaryTreeWithAdditionalEdge() throws Exception {
        runTest("testData/sessionInvalidation/binaryTreeWithAdditionalEdge/");
    }

    @TestMetadata("binaryTreeWithInvalidInRoot")
    public void testBinaryTreeWithInvalidInRoot() throws Exception {
        runTest("testData/sessionInvalidation/binaryTreeWithInvalidInRoot/");
    }

    @TestMetadata("linear")
    public void testLinear() throws Exception {
        runTest("testData/sessionInvalidation/linear/");
    }

    @TestMetadata("rhombus")
    public void testRhombus() throws Exception {
        runTest("testData/sessionInvalidation/rhombus/");
    }

    @TestMetadata("rhombusWithTwoInvalid")
    public void testRhombusWithTwoInvalid() throws Exception {
        runTest("testData/sessionInvalidation/rhombusWithTwoInvalid/");
    }
}
