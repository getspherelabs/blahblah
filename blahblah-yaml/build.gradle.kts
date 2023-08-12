plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.kotlinx.binary-compatibility-validator") version "0.13.2"
}

kotlin {
    explicitApi()
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
        publishAllLibraryVariants()
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "blahblah-yaml"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(Deps.Yaml.kt)
                implementation(Deps.IO.okio)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation("com.squareup.okio:okio-fakefilesystem:${Version.okioVersion}")
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependsOn(commonMain)
            dependencies {
                implementation(Deps.IO.okio)
            }
        }
        val androidUnitTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            dependencies {
                implementation(Deps.IO.okio)
            }
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

tasks.register<Copy>("copyiOSTestResources") {
    from("src/commonTest/resources")
    into("build/bin/iosX64/debugTest/resources")
}

tasks.findByName("iosX64Test")!!.dependsOn("copyiOSTestResources")

android {
    namespace = "io.spherelabs.blahblahyaml"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}
