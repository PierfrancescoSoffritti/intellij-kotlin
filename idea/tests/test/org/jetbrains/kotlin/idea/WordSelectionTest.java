/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea;

import com.intellij.rt.execution.junit.FileComparisonFailure;
import com.intellij.testFramework.LightProjectDescriptor;
import com.intellij.testFramework.fixtures.CodeInsightTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.idea.test.TestRoot;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.RunWith;

import java.io.File;

@TestRoot("idea/tests")
@TestMetadata("testData/wordSelection")
@RunWith(JUnit38ClassRunner.class)
public class WordSelectionTest extends KotlinLightCodeInsightFixtureTestCase {
    public void testStatements() { doTest(); }

    public void testWhenEntries() { doTest(); }

    public void testTypeArguments() { doTest(); }

    public void testValueArguments() { doTest(); }

    public void testTypeParameters() { doTest(); }

    public void testValueParameters() { doTest(); }

    public void testValueParameters2() {
        doTest();
    }

    public void testValueParametersInLambda() { doTest(); }

    public void testValueParametersInLambda2() { doTest(); }

    public void testValueParametersInLambda3() { doTest(); }

    public void testValueParametersInLambda4() { doTest(); }

    public void testDocComment() { doTest(); }

    public void testDocCommentOneLine() { doTest(); }

    public void testDocCommentTagName() { doTest(); }

    public void testDocCommentTagText() { doTest(); }

    public void testDocCommentTagLink() { doTest(); }

    public void testFunctionWithLineCommentBefore() { doTest(); }

    public void testFunctionWithLineCommentAfter() { doTest(); }

    public void testLineComment() { doTest(); }

    public void testSimpleComment() { doTest(); }

    public void testIfBody() { doTest(); }

    public void testCommentForStatements() { doTest(); }

    public void testCommentForStatementsInLambda() { doTest(); }

    public void testSimpleStringLiteral() { doTest(); }
    public void testSimpleStringLiteral2() { doTest(); }

    public void testTemplateStringLiteral1() { doTest(); }
    public void testTemplateStringLiteral2() { doTest(); }
    public void testTemplateStringLiteral3() { doTest(); }

    public void testForRange() { doTest(); }

    public void testIfCondition() { doTest(); }

    public void testMultiDeclaration() { doTest(); }

    public void testInvokedExpression() {
        doTest();
    }

    public void testDefiningVariable() { doTest(); }

    public void testDefiningSuperClass() {
        doTest();
    }

    public void testDefiningMultipleSuperClass() {
        doTest();
    }

    public void testObjectExpression() {
        doTest();
    }

    public void testKT13675() {
        doTest();
    }

    public void testLambdaArgument1() {
        doTest();
    }
    public void testLambdaArgument2() {
        doTest();
    }
    public void testLambdaArgument3() {
        doTest();
    }
    public void testLambdaArgument4() {
        doTest();
    }

    public void testArrayBrackets() {
        doTest();
    }

    public void testClass() {
        doTest();
    }

    public void testDeclarationWithComment1() { doTest(); }
    public void testDeclarationWithComment2() { doTest(); }
    public void testDeclarationWithComment3() { doTest(); }
    public void testDeclarationWithComment4() { doTest(); }
    public void testDeclarationWithDocComment() { doTest(); }

    public void testLeftBrace() { doTest(); }
    public void testRightBrace() { doTest(); }

    public void testLabeledReturn() { doTest(); }

    public void testClassMember1() { doTest(); }
    public void testClassMember2() { doTest(); }
    public void testClassMember3() { doTest(); }
    public void testClassMember4() { doTest(); }
    public void testClassMember5() { doTest(); }

    public void testEscapedIdentifier() { doTest(); }

    private void doTest() {
        String dirName = getTestName(false);

        File dir = new File(myFixture.getTestDataPath(), dirName);
        int filesCount = dir.listFiles().length;
        String[] afterFiles = new String[filesCount - 1];
        for (int i = 1; i < filesCount; i++) {
            afterFiles[i - 1] = dirName + File.separator + i + ".kt";
        }

        try {
            CodeInsightTestUtil.doWordSelectionTest(myFixture,  dirName + File.separator + "0.kt", afterFiles);
        }
        catch (FileComparisonFailure error) {
            wrapToFileComparisonFailure(error.getFilePath());
        }
        catch (AssertionError error) {
            String message = error.getMessage();
            String path = message.substring(0, message.indexOf(":"));
            wrapToFileComparisonFailure(path);
        }
    }

    @NotNull
    @Override
    protected LightProjectDescriptor getProjectDescriptor() {
        return JAVA_LATEST;
    }

    private void wrapToFileComparisonFailure(String failedFilePath) {
        KotlinTestUtils.assertEqualsToFile(new File(failedFilePath), myFixture.getEditor());
    }
}
