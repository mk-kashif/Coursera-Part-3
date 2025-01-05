pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

gradle.beforeProject {
    extensions.findByType<JavaPluginExtension>()?.apply {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(11))
        }
    }
}

include(":app")