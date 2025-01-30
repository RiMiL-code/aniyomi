buildscript {
    dependencies {
        classpath(libs.android.shortcut.gradle)
    }
}

plugins {
    alias(kotlinx.plugins.serialization) apply false
    alias(libs.plugins.aboutLibraries) apply false
    alias(libs.plugins.moko) apply false
    alias(libs.plugins.sqldelight) apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
dependencies {
    // PDF Viewer dependency
    implementation("com.github.barteksc:android-pdf-viewer:3.2.0-beta.1")

    // ePub Reader dependency
    implementation("nl.siegmann.epublib:epublib-core:3.1")

    // Other necessary dependencies...
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
}