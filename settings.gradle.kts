pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "blahblah"
include(":blahblah-fake")
include(":blahblah-random")
include(":blahblah-yaml")
include(":samples")
include(":blahblah-resource")
include(":samples:blahblah-kmp")
