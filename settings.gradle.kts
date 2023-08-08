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
