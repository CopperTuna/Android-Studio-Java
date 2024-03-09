buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.1")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
//Add the plugin as a dependency to your project-level build.gradle.kts file:
//Root-level (project-level) Gradle file (<project>/build.gradle.kts):
plugins {
    id("com.android.application") version "8.3.0" apply false
    id("com.google.gms.google-services") version "4.4.1" apply false
}