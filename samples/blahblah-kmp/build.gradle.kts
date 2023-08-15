plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach {
        it.binaries.framework {
            baseName = "blahblah-kmp"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api("io.github.behzodhalil:blahblah-fake:0.2.5")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "io.spherelabs.blahblahkmp"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}
dependencies {
    androidTestImplementation("org.testng:testng:6.9.6")
}
