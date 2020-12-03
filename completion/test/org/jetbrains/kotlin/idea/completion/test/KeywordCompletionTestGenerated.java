/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("completion")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/keywords")
public class KeywordCompletionTestGenerated extends AbstractKeywordCompletionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("AfterClassName.kt")
    public void testAfterClassName() throws Exception {
        runTest("testData/keywords/AfterClassName.kt");
    }

    @TestMetadata("AfterClassProperty.kt")
    public void testAfterClassProperty() throws Exception {
        runTest("testData/keywords/AfterClassProperty.kt");
    }

    @TestMetadata("AfterClasses.kt")
    public void testAfterClasses() throws Exception {
        runTest("testData/keywords/AfterClasses.kt");
    }

    @TestMetadata("AfterClasses_LangLevel10.kt")
    public void testAfterClasses_LangLevel10() throws Exception {
        runTest("testData/keywords/AfterClasses_LangLevel10.kt");
    }

    @TestMetadata("AfterClasses_LangLevel11.kt")
    public void testAfterClasses_LangLevel11() throws Exception {
        runTest("testData/keywords/AfterClasses_LangLevel11.kt");
    }

    @TestMetadata("AfterDot.kt")
    public void testAfterDot() throws Exception {
        runTest("testData/keywords/AfterDot.kt");
    }

    @TestMetadata("AfterFuns.kt")
    public void testAfterFuns() throws Exception {
        runTest("testData/keywords/AfterFuns.kt");
    }

    @TestMetadata("AfterIf.kt")
    public void testAfterIf() throws Exception {
        runTest("testData/keywords/AfterIf.kt");
    }

    @TestMetadata("AfterSafeDot.kt")
    public void testAfterSafeDot() throws Exception {
        runTest("testData/keywords/AfterSafeDot.kt");
    }

    @TestMetadata("AfterSpaceAndDot.kt")
    public void testAfterSpaceAndDot() throws Exception {
        runTest("testData/keywords/AfterSpaceAndDot.kt");
    }

    @TestMetadata("AfterTry.kt")
    public void testAfterTry() throws Exception {
        runTest("testData/keywords/AfterTry.kt");
    }

    @TestMetadata("AfterTryCatch.kt")
    public void testAfterTryCatch() throws Exception {
        runTest("testData/keywords/AfterTryCatch.kt");
    }

    @TestMetadata("AfterTryFinally.kt")
    public void testAfterTryFinally() throws Exception {
        runTest("testData/keywords/AfterTryFinally.kt");
    }

    @TestMetadata("AfterTryInAssignment.kt")
    public void testAfterTryInAssignment() throws Exception {
        runTest("testData/keywords/AfterTryInAssignment.kt");
    }

    @TestMetadata("BeforeClass.kt")
    public void testBeforeClass() throws Exception {
        runTest("testData/keywords/BeforeClass.kt");
    }

    @TestMetadata("BeforeDelegationCall.kt")
    public void testBeforeDelegationCall() throws Exception {
        runTest("testData/keywords/BeforeDelegationCall.kt");
    }

    @TestMetadata("BreakContinue.kt")
    public void testBreakContinue() throws Exception {
        runTest("testData/keywords/BreakContinue.kt");
    }

    @TestMetadata("BreakWithLabel.kt")
    public void testBreakWithLabel() throws Exception {
        runTest("testData/keywords/BreakWithLabel.kt");
    }

    @TestMetadata("CommaExpected.kt")
    public void testCommaExpected() throws Exception {
        runTest("testData/keywords/CommaExpected.kt");
    }

    @TestMetadata("CompanionObjectBeforeObject.kt")
    public void testCompanionObjectBeforeObject() throws Exception {
        runTest("testData/keywords/CompanionObjectBeforeObject.kt");
    }

    @TestMetadata("ContinueWithLabel.kt")
    public void testContinueWithLabel() throws Exception {
        runTest("testData/keywords/ContinueWithLabel.kt");
    }

    @TestMetadata("Else1.kt")
    public void testElse1() throws Exception {
        runTest("testData/keywords/Else1.kt");
    }

    @TestMetadata("Else2.kt")
    public void testElse2() throws Exception {
        runTest("testData/keywords/Else2.kt");
    }

    @TestMetadata("FileKeyword.kt")
    public void testFileKeyword() throws Exception {
        runTest("testData/keywords/FileKeyword.kt");
    }

    @TestMetadata("FixingLayoutAndReturn.kt")
    public void testFixingLayoutAndReturn() throws Exception {
        runTest("testData/keywords/FixingLayoutAndReturn.kt");
    }

    @TestMetadata("GlobalPropertyAccessors.kt")
    public void testGlobalPropertyAccessors() throws Exception {
        runTest("testData/keywords/GlobalPropertyAccessors.kt");
    }

    @TestMetadata("IfTry.kt")
    public void testIfTry() throws Exception {
        runTest("testData/keywords/IfTry.kt");
    }

    @TestMetadata("IfTryCatch.kt")
    public void testIfTryCatch() throws Exception {
        runTest("testData/keywords/IfTryCatch.kt");
    }

    @TestMetadata("InAnnotationClassScope.kt")
    public void testInAnnotationClassScope() throws Exception {
        runTest("testData/keywords/InAnnotationClassScope.kt");
    }

    @TestMetadata("InArgumentList.kt")
    public void testInArgumentList() throws Exception {
        runTest("testData/keywords/InArgumentList.kt");
    }

    @TestMetadata("InBlockComment.kt")
    public void testInBlockComment() throws Exception {
        runTest("testData/keywords/InBlockComment.kt");
    }

    @TestMetadata("InChar.kt")
    public void testInChar() throws Exception {
        runTest("testData/keywords/InChar.kt");
    }

    @TestMetadata("InClassBeforeFun.kt")
    public void testInClassBeforeFun() throws Exception {
        runTest("testData/keywords/InClassBeforeFun.kt");
    }

    @TestMetadata("InClassNoCompletionInValName.kt")
    public void testInClassNoCompletionInValName() throws Exception {
        runTest("testData/keywords/InClassNoCompletionInValName.kt");
    }

    @TestMetadata("InClassProperty.kt")
    public void testInClassProperty() throws Exception {
        runTest("testData/keywords/InClassProperty.kt");
    }

    @TestMetadata("InClassScope.kt")
    public void testInClassScope() throws Exception {
        runTest("testData/keywords/InClassScope.kt");
    }

    @TestMetadata("InClassTypeParameters.kt")
    public void testInClassTypeParameters() throws Exception {
        runTest("testData/keywords/InClassTypeParameters.kt");
    }

    @TestMetadata("InCodeBlock.kt")
    public void testInCodeBlock() throws Exception {
        runTest("testData/keywords/InCodeBlock.kt");
    }

    @TestMetadata("InElse.kt")
    public void testInElse() throws Exception {
        runTest("testData/keywords/InElse.kt");
    }

    @TestMetadata("InEnumScope1.kt")
    public void testInEnumScope1() throws Exception {
        runTest("testData/keywords/InEnumScope1.kt");
    }

    @TestMetadata("InEnumScope2.kt")
    public void testInEnumScope2() throws Exception {
        runTest("testData/keywords/InEnumScope2.kt");
    }

    @TestMetadata("InFunctionExpressionBody.kt")
    public void testInFunctionExpressionBody() throws Exception {
        runTest("testData/keywords/InFunctionExpressionBody.kt");
    }

    @TestMetadata("InFunctionName.kt")
    public void testInFunctionName() throws Exception {
        runTest("testData/keywords/InFunctionName.kt");
    }

    @TestMetadata("InFunctionRecieverType.kt")
    public void testInFunctionRecieverType() throws Exception {
        runTest("testData/keywords/InFunctionRecieverType.kt");
    }

    @TestMetadata("InFunctionTypePosition.kt")
    public void testInFunctionTypePosition() throws Exception {
        runTest("testData/keywords/InFunctionTypePosition.kt");
    }

    @TestMetadata("InGetterExpressionBody.kt")
    public void testInGetterExpressionBody() throws Exception {
        runTest("testData/keywords/InGetterExpressionBody.kt");
    }

    @TestMetadata("InIf.kt")
    public void testInIf() throws Exception {
        runTest("testData/keywords/InIf.kt");
    }

    @TestMetadata("InInterfaceScope.kt")
    public void testInInterfaceScope() throws Exception {
        runTest("testData/keywords/InInterfaceScope.kt");
    }

    @TestMetadata("InMemberFunParametersList.kt")
    public void testInMemberFunParametersList() throws Exception {
        runTest("testData/keywords/InMemberFunParametersList.kt");
    }

    @TestMetadata("InModifierListInsideClass.kt")
    public void testInModifierListInsideClass() throws Exception {
        runTest("testData/keywords/InModifierListInsideClass.kt");
    }

    @TestMetadata("InNotFinishedGenericWithFunAfter.kt")
    public void testInNotFinishedGenericWithFunAfter() throws Exception {
        runTest("testData/keywords/InNotFinishedGenericWithFunAfter.kt");
    }

    @TestMetadata("InObjectScope.kt")
    public void testInObjectScope() throws Exception {
        runTest("testData/keywords/InObjectScope.kt");
    }

    @TestMetadata("InParameterDefaultValue.kt")
    public void testInParameterDefaultValue() throws Exception {
        runTest("testData/keywords/InParameterDefaultValue.kt");
    }

    @TestMetadata("InPrimaryConstructorParametersList.kt")
    public void testInPrimaryConstructorParametersList() throws Exception {
        runTest("testData/keywords/InPrimaryConstructorParametersList.kt");
    }

    @TestMetadata("InPropertyInitializer.kt")
    public void testInPropertyInitializer() throws Exception {
        runTest("testData/keywords/InPropertyInitializer.kt");
    }

    @TestMetadata("InPropertyTypeReference.kt")
    public void testInPropertyTypeReference() throws Exception {
        runTest("testData/keywords/InPropertyTypeReference.kt");
    }

    @TestMetadata("InString.kt")
    public void testInString() throws Exception {
        runTest("testData/keywords/InString.kt");
    }

    @TestMetadata("InTopFunParametersList.kt")
    public void testInTopFunParametersList() throws Exception {
        runTest("testData/keywords/InTopFunParametersList.kt");
    }

    @TestMetadata("InTopScopeAfterPackage.kt")
    public void testInTopScopeAfterPackage() throws Exception {
        runTest("testData/keywords/InTopScopeAfterPackage.kt");
    }

    @TestMetadata("InTypePosition.kt")
    public void testInTypePosition() throws Exception {
        runTest("testData/keywords/InTypePosition.kt");
    }

    @TestMetadata("LabeledLambdaThis.kt")
    public void testLabeledLambdaThis() throws Exception {
        runTest("testData/keywords/LabeledLambdaThis.kt");
    }

    @TestMetadata("LineComment.kt")
    public void testLineComment() throws Exception {
        runTest("testData/keywords/LineComment.kt");
    }

    @TestMetadata("NoBreak1.kt")
    public void testNoBreak1() throws Exception {
        runTest("testData/keywords/NoBreak1.kt");
    }

    @TestMetadata("NoBreak2.kt")
    public void testNoBreak2() throws Exception {
        runTest("testData/keywords/NoBreak2.kt");
    }

    @TestMetadata("NoCompanionThis.kt")
    public void testNoCompanionThis() throws Exception {
        runTest("testData/keywords/NoCompanionThis.kt");
    }

    @TestMetadata("NoCompletionForCapitalPrefix.kt")
    public void testNoCompletionForCapitalPrefix() throws Exception {
        runTest("testData/keywords/NoCompletionForCapitalPrefix.kt");
    }

    @TestMetadata("NoContinue.kt")
    public void testNoContinue() throws Exception {
        runTest("testData/keywords/NoContinue.kt");
    }

    @TestMetadata("NoFinalInParameterList.kt")
    public void testNoFinalInParameterList() throws Exception {
        runTest("testData/keywords/NoFinalInParameterList.kt");
    }

    @TestMetadata("NotInNotIs.kt")
    public void testNotInNotIs() throws Exception {
        runTest("testData/keywords/NotInNotIs.kt");
    }

    @TestMetadata("NotInNotIs2.kt")
    public void testNotInNotIs2() throws Exception {
        runTest("testData/keywords/NotInNotIs2.kt");
    }

    @TestMetadata("PrefixMatcher.kt")
    public void testPrefixMatcher() throws Exception {
        runTest("testData/keywords/PrefixMatcher.kt");
    }

    @TestMetadata("PropertyAccessors.kt")
    public void testPropertyAccessors() throws Exception {
        runTest("testData/keywords/PropertyAccessors.kt");
    }

    @TestMetadata("PropertyAccessors2.kt")
    public void testPropertyAccessors2() throws Exception {
        runTest("testData/keywords/PropertyAccessors2.kt");
    }

    @TestMetadata("PropertySetter.kt")
    public void testPropertySetter() throws Exception {
        runTest("testData/keywords/PropertySetter.kt");
    }

    @TestMetadata("QualifiedThis.kt")
    public void testQualifiedThis() throws Exception {
        runTest("testData/keywords/QualifiedThis.kt");
    }

    @TestMetadata("QualifiedThisInAccessor.kt")
    public void testQualifiedThisInAccessor() throws Exception {
        runTest("testData/keywords/QualifiedThisInAccessor.kt");
    }

    @TestMetadata("Receiver.kt")
    public void testReceiver() throws Exception {
        runTest("testData/keywords/Receiver.kt");
    }

    @TestMetadata("Return1.kt")
    public void testReturn1() throws Exception {
        runTest("testData/keywords/Return1.kt");
    }

    @TestMetadata("Return2.kt")
    public void testReturn2() throws Exception {
        runTest("testData/keywords/Return2.kt");
    }

    @TestMetadata("Return3.kt")
    public void testReturn3() throws Exception {
        runTest("testData/keywords/Return3.kt");
    }

    @TestMetadata("Return4.kt")
    public void testReturn4() throws Exception {
        runTest("testData/keywords/Return4.kt");
    }

    @TestMetadata("Return5.kt")
    public void testReturn5() throws Exception {
        runTest("testData/keywords/Return5.kt");
    }

    @TestMetadata("Return6.kt")
    public void testReturn6() throws Exception {
        runTest("testData/keywords/Return6.kt");
    }

    @TestMetadata("Return7.kt")
    public void testReturn7() throws Exception {
        runTest("testData/keywords/Return7.kt");
    }

    @TestMetadata("Return8.kt")
    public void testReturn8() throws Exception {
        runTest("testData/keywords/Return8.kt");
    }

    @TestMetadata("Return9.kt")
    public void testReturn9() throws Exception {
        runTest("testData/keywords/Return9.kt");
    }

    @TestMetadata("ReturnBoolean.kt")
    public void testReturnBoolean() throws Exception {
        runTest("testData/keywords/ReturnBoolean.kt");
    }

    @TestMetadata("ReturnCollection.kt")
    public void testReturnCollection() throws Exception {
        runTest("testData/keywords/ReturnCollection.kt");
    }

    @TestMetadata("ReturnIterable.kt")
    public void testReturnIterable() throws Exception {
        runTest("testData/keywords/ReturnIterable.kt");
    }

    @TestMetadata("ReturnKeywordName.kt")
    public void testReturnKeywordName() throws Exception {
        runTest("testData/keywords/ReturnKeywordName.kt");
    }

    @TestMetadata("ReturnList.kt")
    public void testReturnList() throws Exception {
        runTest("testData/keywords/ReturnList.kt");
    }

    @TestMetadata("ReturnNotNull.kt")
    public void testReturnNotNull() throws Exception {
        runTest("testData/keywords/ReturnNotNull.kt");
    }

    @TestMetadata("ReturnNull.kt")
    public void testReturnNull() throws Exception {
        runTest("testData/keywords/ReturnNull.kt");
    }

    @TestMetadata("ReturnNullableBoolean.kt")
    public void testReturnNullableBoolean() throws Exception {
        runTest("testData/keywords/ReturnNullableBoolean.kt");
    }

    @TestMetadata("ReturnSet.kt")
    public void testReturnSet() throws Exception {
        runTest("testData/keywords/ReturnSet.kt");
    }

    @TestMetadata("SealedForDeclaredClass.kt")
    public void testSealedForDeclaredClass() throws Exception {
        runTest("idea/idea-completion/testData/keywords/SealedForDeclaredClass.kt");
    }

    @TestMetadata("SealedForDeclaredInterface.kt")
    public void testSealedForDeclaredInterface() throws Exception {
        runTest("idea/idea-completion/testData/keywords/SealedForDeclaredInterface.kt");
    }

    @TestMetadata("SealedWithName.kt")
    public void testSealedWithName() throws Exception {
        runTest("idea/idea-completion/testData/keywords/SealedWithName.kt");
    }

    @TestMetadata("SealedWithoutName.kt")
    public void testSealedWithoutName() throws Exception {
        runTest("idea/idea-completion/testData/keywords/SealedWithoutName.kt");
    }

    @TestMetadata("SuspendInParameterTypePosition.kt")
    public void testSuspendInParameterTypePosition() throws Exception {
        runTest("testData/keywords/SuspendInParameterTypePosition.kt");
    }

    @TestMetadata("SuspendInsideTypeArguments.kt")
    public void testSuspendInsideTypeArguments() throws Exception {
        runTest("testData/keywords/SuspendInsideTypeArguments.kt");
    }

    @TestMetadata("SuspendInsideTypeArguments1.kt")
    public void testSuspendInsideTypeArguments1() throws Exception {
        runTest("testData/keywords/SuspendInsideTypeArguments1.kt");
    }

    @TestMetadata("This.kt")
    public void testThis() throws Exception {
        runTest("testData/keywords/This.kt");
    }

    @TestMetadata("ThisPrefixMatching.kt")
    public void testThisPrefixMatching() throws Exception {
        runTest("testData/keywords/ThisPrefixMatching.kt");
    }

    @TestMetadata("TopScope.kt")
    public void testTopScope() throws Exception {
        runTest("testData/keywords/TopScope.kt");
    }

    @TestMetadata("topScope2.kt")
    public void testTopScope2() throws Exception {
        runTest("testData/keywords/topScope2.kt");
    }

    @TestMetadata("TopScope3-.kt")
    public void testTopScope3_() throws Exception {
        runTest("testData/keywords/TopScope3-.kt");
    }

    @TestMetadata("UseSiteTargetForPrimaryConstructorParameter.kt")
    public void testUseSiteTargetForPrimaryConstructorParameter() throws Exception {
        runTest("testData/keywords/UseSiteTargetForPrimaryConstructorParameter.kt");
    }
}
