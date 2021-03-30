/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.refactoring.move;

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
@TestRoot("idea/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/refactoring/moveMultiModule")
public class MultiModuleMoveTestGenerated extends AbstractMultiModuleMoveTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("moveClassWithInternalMemberFromJvmToCommon/moveClassWithInternalMemberFromJvmToCommon.test")
    public void testMoveClassWithInternalMemberFromJvmToCommon_MoveClassWithInternalMemberFromJvmToCommon() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveClassWithInternalMemberFromJvmToCommon/moveClassWithInternalMemberFromJvmToCommon.test");
    }

    @TestMetadata("moveDirectoryKeepPackageDirective/moveDirectoryKeepPackageDirective.test")
    public void testMoveDirectoryKeepPackageDirective_MoveDirectoryKeepPackageDirective() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveDirectoryKeepPackageDirective/moveDirectoryKeepPackageDirective.test");
    }

    @TestMetadata("moveDirectoryToUnrelatedModuleConflict/moveDirectoryToUnrelatedModuleConflict.test")
    public void testMoveDirectoryToUnrelatedModuleConflict_MoveDirectoryToUnrelatedModuleConflict() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveDirectoryToUnrelatedModuleConflict/moveDirectoryToUnrelatedModuleConflict.test");
    }

    @TestMetadata("moveFileToNonSrc/moveFileToNonSrc.test")
    public void testMoveFileToNonSrc_MoveFileToNonSrc() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveFileToNonSrc/moveFileToNonSrc.test");
    }

    @TestMetadata("moveFileWithDeclarationsToUnrelatedModuleConflict/moveFileWithDeclarationsToUnrelatedModuleConflict.test")
    public void testMoveFileWithDeclarationsToUnrelatedModuleConflict_MoveFileWithDeclarationsToUnrelatedModuleConflict() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveFileWithDeclarationsToUnrelatedModuleConflict/moveFileWithDeclarationsToUnrelatedModuleConflict.test");
    }

    @TestMetadata("moveFromJsModuleToJvmModule/moveFromJsModuleToJvmModule.test")
    public void testMoveFromJsModuleToJvmModule_MoveFromJsModuleToJvmModule() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveFromJsModuleToJvmModule/moveFromJsModuleToJvmModule.test");
    }

    @TestMetadata("moveFromJvmModuleToJsModule/moveFromJvmModuleToJsModule.test")
    public void testMoveFromJvmModuleToJsModule_MoveFromJvmModuleToJsModule() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveFromJvmModuleToJsModule/moveFromJvmModuleToJsModule.test");
    }

    @TestMetadata("moveInternalToAnotherModule/moveInternalToAnotherModule.test")
    public void testMoveInternalToAnotherModule_MoveInternalToAnotherModule() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveInternalToAnotherModule/moveInternalToAnotherModule.test");
    }

    @TestMetadata("moveJdkDependentToJsModule/moveJdkDependentToJsModule.test")
    public void testMoveJdkDependentToJsModule_MoveJdkDependentToJsModule() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveJdkDependentToJsModule/moveJdkDependentToJsModule.test");
    }

    @TestMetadata("moveMultipleFilesToUnrelatedModuleConflict/moveMultipleFilesToUnrelatedModuleConflict.test")
    public void testMoveMultipleFilesToUnrelatedModuleConflict_MoveMultipleFilesToUnrelatedModuleConflict() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveMultipleFilesToUnrelatedModuleConflict/moveMultipleFilesToUnrelatedModuleConflict.test");
    }

    @TestMetadata("movePackageToUnrelatedModuleConflict/movePackageToUnrelatedModuleConflict.test")
    public void testMovePackageToUnrelatedModuleConflict_MovePackageToUnrelatedModuleConflict() throws Exception {
        runTest("testData/refactoring/moveMultiModule/movePackageToUnrelatedModuleConflict/movePackageToUnrelatedModuleConflict.test");
    }

    @TestMetadata("moveRefToLibTypeAliasImplementingLibExpectClass/moveRefToLibTypeAliasImplementingLibExpectClass.test")
    public void testMoveRefToLibTypeAliasImplementingLibExpectClass_MoveRefToLibTypeAliasImplementingLibExpectClass() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveRefToLibTypeAliasImplementingLibExpectClass/moveRefToLibTypeAliasImplementingLibExpectClass.test");
    }

    @TestMetadata("moveSealedCheckEntireHierarchy/moveSealedCheckEntireHierarchy.test")
    public void testMoveSealedCheckEntireHierarchy_MoveSealedCheckEntireHierarchy() throws Exception {
        runTest("idea/testData/refactoring/moveMultiModule/moveSealedCheckEntireHierarchy/moveSealedCheckEntireHierarchy.test");
    }

    @TestMetadata("moveSealedCheckNotMember/moveSealedCheckNotMember.test")
    public void testMoveSealedCheckNotMember_MoveSealedCheckNotMember() throws Exception {
        runTest("idea/testData/refactoring/moveMultiModule/moveSealedCheckNotMember/moveSealedCheckNotMember.test");
    }

    @TestMetadata("moveSealedCheckOriginalPackageHasMember/moveSealedCheckOriginalPackageHasMember.test")
    public void testMoveSealedCheckOriginalPackageHasMember_MoveSealedCheckOriginalPackageHasMember() throws Exception {
        runTest("idea/testData/refactoring/moveMultiModule/moveSealedCheckOriginalPackageHasMember/moveSealedCheckOriginalPackageHasMember.test");
    }

    @TestMetadata("moveSealedCheckOriginalPackageHasMemberCrossModule/moveSealedCheckOriginalPackageHasMemberCrossModule.test")
    public void testMoveSealedCheckOriginalPackageHasMemberCrossModule_MoveSealedCheckOriginalPackageHasMemberCrossModule() throws Exception {
        runTest("idea/testData/refactoring/moveMultiModule/moveSealedCheckOriginalPackageHasMemberCrossModule/moveSealedCheckOriginalPackageHasMemberCrossModule.test");
    }

    @TestMetadata("moveSealedCheckSingleSealed/moveSealedCheckSingleSealed.test")
    public void testMoveSealedCheckSingleSealed_MoveSealedCheckSingleSealed() throws Exception {
        runTest("idea/testData/refactoring/moveMultiModule/moveSealedCheckSingleSealed/moveSealedCheckSingleSealed.test");
    }

    @TestMetadata("moveSealedCheckTargetPackageHasMember/moveSealedCheckTargetPackageHasMember.test")
    public void testMoveSealedCheckTargetPackageHasMember_MoveSealedCheckTargetPackageHasMember() throws Exception {
        runTest("idea/testData/refactoring/moveMultiModule/moveSealedCheckTargetPackageHasMember/moveSealedCheckTargetPackageHasMember.test");
    }

    @TestMetadata("moveSealedCheckTargetPackageHasMemberCrossModule/moveSealedCheckTargetPackageHasMemberCrossModule.test")
    public void testMoveSealedCheckTargetPackageHasMemberCrossModule_MoveSealedCheckTargetPackageHasMemberCrossModule() throws Exception {
        runTest("idea/testData/refactoring/moveMultiModule/moveSealedCheckTargetPackageHasMemberCrossModule/moveSealedCheckTargetPackageHasMemberCrossModule.test");
    }

    @TestMetadata("moveSealedCheckTargetPackageHasNoMembers/moveSealedCheckTargetPackageHasNoMembers.test")
    public void testMoveSealedCheckTargetPackageHasNoMembers_MoveSealedCheckTargetPackageHasNoMembers() throws Exception {
        runTest("idea/testData/refactoring/moveMultiModule/moveSealedCheckTargetPackageHasNoMembers/moveSealedCheckTargetPackageHasNoMembers.test");
    }

    @TestMetadata("moveSealedCheckTargetPackageHasNoMembersCrossModule/moveSealedCheckTargetPackageHasNoMembersCrossModule.test")
    public void testMoveSealedCheckTargetPackageHasNoMembersCrossModule_MoveSealedCheckTargetPackageHasNoMembersCrossModule() throws Exception {
        runTest("idea/testData/refactoring/moveMultiModule/moveSealedCheckTargetPackageHasNoMembersCrossModule/moveSealedCheckTargetPackageHasNoMembersCrossModule.test");
    }

    @TestMetadata("moveSealedCheckTargetPackageHasNoMembersCrossModuleBig/moveSealedCheckTargetPackageHasNoMembersCrossModuleBig.test")
    public void testMoveSealedCheckTargetPackageHasNoMembersCrossModuleBig_MoveSealedCheckTargetPackageHasNoMembersCrossModuleBig() throws Exception {
        runTest("idea/testData/refactoring/moveMultiModule/moveSealedCheckTargetPackageHasNoMembersCrossModuleBig/moveSealedCheckTargetPackageHasNoMembersCrossModuleBig.test");
    }

    @TestMetadata("moveSealedCheckWithinPackage/moveSealedCheckWithinPackage.test")
    public void testMoveSealedCheckWithinPackage_MoveSealedCheckWithinPackage() throws Exception {
        runTest("idea/testData/refactoring/moveMultiModule/moveSealedCheckWithinPackage/moveSealedCheckWithinPackage.test");
    }

    @TestMetadata("moveToModuleWithoutLibConflict/moveToModuleWithoutLibConflict.test")
    public void testMoveToModuleWithoutLibConflict_MoveToModuleWithoutLibConflict() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveToModuleWithoutLibConflict/moveToModuleWithoutLibConflict.test");
    }

    @TestMetadata("moveToUnrelatedModuleConflict/moveToUnrelatedModuleConflict.test")
    public void testMoveToUnrelatedModuleConflict_MoveToUnrelatedModuleConflict() throws Exception {
        runTest("testData/refactoring/moveMultiModule/moveToUnrelatedModuleConflict/moveToUnrelatedModuleConflict.test");
    }

    @TestMetadata("visibilityConflictInImport/visibilityConflictInImport.test")
    public void testVisibilityConflictInImport_VisibilityConflictInImport() throws Exception {
        runTest("testData/refactoring/moveMultiModule/visibilityConflictInImport/visibilityConflictInImport.test");
    }
}
