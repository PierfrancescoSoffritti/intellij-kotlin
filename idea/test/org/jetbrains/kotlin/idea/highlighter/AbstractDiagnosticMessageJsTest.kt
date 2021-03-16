/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */
package org.jetbrains.kotlin.idea.highlighter

import org.jetbrains.kotlin.analyzer.AnalysisResult
import org.jetbrains.kotlin.config.CommonConfigurationKeys
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.config.LanguageVersionSettings
import org.jetbrains.kotlin.config.languageVersionSettings
import org.jetbrains.kotlin.idea.artifacts.KotlinArtifacts.Companion.instance
import org.jetbrains.kotlin.idea.test.IDEA_TEST_DATA_DIR
import org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles
import org.jetbrains.kotlin.js.config.JSConfigurationKeys
import org.jetbrains.kotlin.js.config.JsConfig
import org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs
import org.jetbrains.kotlin.psi.KtFile
import java.io.File
import java.lang.reflect.Field

abstract class AbstractDiagnosticMessageJsTest : AbstractDiagnosticMessageTest() {
    override fun analyze(files: Collection<KtFile>, configuration: CompilerConfiguration): AnalysisResult {
        return analyzeFiles(files, JsConfig(project, configuration))
    }

    override val testDataDirectory: File
        get() = File(IDEA_TEST_DATA_DIR, "diagnosticMessage/js")

    override fun getPlatformSpecificDiagnosticField(diagnosticName: String): Field? {
        return getFieldOrNull(ErrorsJs::class.java, diagnosticName)
    }

    override fun compilerConfiguration(languageVersionSettings: LanguageVersionSettings): CompilerConfiguration {
        return CompilerConfiguration().apply {
            put(CommonConfigurationKeys.MODULE_NAME, myFixture.module.name)
            put(JSConfigurationKeys.LIBRARIES, jsStdlib())
            put(CommonConfigurationKeys.DISABLE_INLINE, true)
            this.languageVersionSettings = languageVersionSettings
        }
    }

    private fun jsStdlib(): List<String> {
        val stdlibPath = instance.kotlinStdlibJs
        return listOf(stdlibPath.absolutePath)
    }
}