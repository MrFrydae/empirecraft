pluginManagement {
    repositories {
        gradlePluginPortal()
		maven("https://papermc.io/repo/repository/maven-public/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "EmpireCraft"
include("EmpireCraft-API", "EmpireCraft-Server", "paper-api-generator")
