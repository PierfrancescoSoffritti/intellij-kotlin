/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.shortenRefs;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/shortenRefsFir")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirShortenRefsTestGenerated extends AbstractFirShortenRefsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTestWithMuting, this, testDataFilePath);
    }

    public void testAllFilesPresentInShortenRefsFir() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/shortenRefsFir"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @TestMetadata("idea/testData/shortenRefsFir/types")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Types extends AbstractFirShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMuting, this, testDataFilePath);
        }

        public void testAllFilesPresentInTypes() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/shortenRefsFir/types"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("ParameterType.kt")
        public void testParameterType() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterType.kt");
        }

        @TestMetadata("ParameterTypeConflictingTopLevelClassNotUsed.kt")
        public void testParameterTypeConflictingTopLevelClassNotUsed() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeConflictingTopLevelClassNotUsed.kt");
        }

        @TestMetadata("ParameterTypeConflictingTopLevelClassUsed.kt")
        public void testParameterTypeConflictingTopLevelClassUsed() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeConflictingTopLevelClassUsed.kt");
        }

        @TestMetadata("ParameterTypeFunctionalType.kt")
        public void testParameterTypeFunctionalType() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeFunctionalType.kt");
        }

        @TestMetadata("ParameterTypeGenericTypes.kt")
        public void testParameterTypeGenericTypes() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeGenericTypes.kt");
        }

        @TestMetadata("ParameterTypeImportedTypeWins.kt")
        public void testParameterTypeImportedTypeWins() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeImportedTypeWins.kt");
        }

        @TestMetadata("ParameterTypeNestedType.kt")
        public void testParameterTypeNestedType() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeNestedType.kt");
        }

        @TestMetadata("ParameterTypeNonImportedClass.kt")
        public void testParameterTypeNonImportedClass() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeNonImportedClass.kt");
        }

        @TestMetadata("ParameterTypeStarImportedTypeLoses.kt")
        public void testParameterTypeStarImportedTypeLoses() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeStarImportedTypeLoses.kt");
        }

        @TestMetadata("ParameterTypeTopLevelTypeLoses.kt")
        public void testParameterTypeTopLevelTypeLoses() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeTopLevelTypeLoses.kt");
        }

        @TestMetadata("ParameterTypeTopLevelTypeWins.kt")
        public void testParameterTypeTopLevelTypeWins() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeTopLevelTypeWins.kt");
        }

        @TestMetadata("ParameterTypeTwoNonImportedClassesConflict.kt")
        public void testParameterTypeTwoNonImportedClassesConflict() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeTwoNonImportedClassesConflict.kt");
        }

        @TestMetadata("VariableType.kt")
        public void testVariableType() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/VariableType.kt");
        }

        @TestMetadata("VariableTypeConflictWithLocalType.kt")
        public void testVariableTypeConflictWithLocalType() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/VariableTypeConflictWithLocalType.kt");
        }
    }
}
