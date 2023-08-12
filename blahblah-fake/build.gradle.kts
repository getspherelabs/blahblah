plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.kotlinx.binary-compatibility-validator") version "0.13.2"
}

kotlin {
    explicitApi()
    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
        publishAllLibraryVariants()
    }

    targets.configureEach {
        // add another test task with release binary
        if (this is org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithTests<*>) {
            binaries.test(listOf(org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.RELEASE))
            testRuns.create("releaseTest") {
                setExecutionSourceFrom(binaries.getTest(org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.RELEASE))
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach {
        it.binaries.framework {
            baseName = "blahblah-fake"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("net.mamoe.yamlkt:yamlkt:0.12.0")
                api("com.benasher44:uuid:0.8.0")
                implementation(project(":blahblah-yaml"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting
        val androidUnitTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    namespace = "io.spherelabs.blahblahfake"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}
