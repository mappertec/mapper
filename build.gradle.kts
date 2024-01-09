plugins {
    kotlin("jvm") version "1.9.21"
    `maven-publish`
    id("com.github.johnrengelman.shadow") version("8.1.1")
}

group = "dev.mapper"
version = "v0.5.0"

repositories {
    mavenCentral()
}

//dependencies {
//    //implementation("com.google.code.gson:gson:2.10.1")
//    testImplementation("org.jetbrains.kotlin:kotlin-test")
//}

//tasks.test {
//    useJUnitPlatform()
//}
//kotlin {
//    jvmToolchain(8)
//}

tasks {

    shadowJar {
        val folder = System.getenv("pluginFolder_1-20")
        if (folder != null) destinationDirectory.set(file(folder))
        archiveFileName.set("${project.name}-${project.version}.jar")
    }

    processResources{
        expand(project.properties)

        inputs.property("version", rootProject.version)
        filesMatching("plugin.yml") {
            expand("version" to rootProject.version)
        }
    }
}