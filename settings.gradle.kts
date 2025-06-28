pluginManagement {
    repositories {
        google() // 💥 REQUIRED for Android plugins
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google() // 💥 Also required here
        mavenCentral()
    }
}

rootProject.name = "AndroidCIProject"
include(":app") // We'll create this soon
