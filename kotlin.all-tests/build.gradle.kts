// GENERATED build.gradle.kts
// GENERATED BY kotlin.all-tests.iml
// USE `./gradlew generateIdePluginGradleFiles` TO REGENERATE THIS FILE

plugins {
    kotlin("jvm")
    `java-library` // Add `compileOnlyApi` configuration
    id("jps-compatible")
}

repositories {
    maven { setUrl("https://cache-redirector.jetbrains.com/maven-central") }
    maven { setUrl("https://cache-redirector.jetbrains.com/intellij-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jcenter") }
    maven { setUrl("https://cache-redirector.jetbrains.com/dl.google.com/dl/android/maven2") }
    maven { setUrl("https://cache-redirector.jetbrains.com/repo.jenkins-ci.org/releases") }
    maven { setUrl("https://cache-redirector.jetbrains.com/www.myget.org/F/rd-snapshots/maven") }
    maven { setUrl("https://cache-redirector.jetbrains.com/download.jetbrains.com/teamcity-repository") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide-plugin-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide-plugin-dependencies") }
}

disableDependencyVerification()

dependencies {
    implementation(toolsJarApi())
    jpsLikeModuleDependency(":kotlin-ide.kotlin.common", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.allopen", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.annotation-based-compiler-support", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.kapt", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.kotlinx-serialization", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.noarg", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.sam-with-receiver", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.scripting", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.lombok", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.core", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.formatter", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.git", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.gradle.gradle-idea", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.gradle.gradle-native", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.gradle.gradle-tooling", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.idea", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.j2k.idea", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.j2k.new", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.j2k.old", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.j2k.services", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jps-common", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jps-plugin", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.core", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.coroutines", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.eval4j", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.evaluation", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.sequence", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.test", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.util", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.maven", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.native", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.project-wizard.cli", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.project-wizard.core", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.project-wizard.idea", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.repl", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.scripting", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.scripting-support", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.test-framework", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.tests-common", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.uast.uast-kotlin", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.uast.uast-kotlin-idea", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.performance-tests", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.scripting-ide-services", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.fir.frontend-independent", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.line-indent-provider", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.resources-fe10", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.parcelize", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.idea.tests", JpsDepScope.COMPILE)
}

configurations.all {
    exclude(module = "tests-common") // Avoid classes with same FQN clashing
}

sourceSets {
    "main" {
        
    }
    "test" {
        
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile> {
    kotlinOptions.freeCompilerArgs = listOf("-version", "-Xstrict-java-nullability-assertions", "-Xjvm-default=enable", "-Xopt-in=kotlin.io.path.ExperimentalPathApi")
    kotlinOptions.useOldBackend = true // KT-45697
}

// Fake empty configuration in order to make `DependencyHandler.projectTests(name: String)` work
configurations.getOrCreate("tests-jar")