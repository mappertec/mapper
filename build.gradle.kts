plugins {
    kotlin("jvm") version "1.9.21"
    `maven-publish`
}

group = "dev.mapper"
version = "v0.3.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.10.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(8)
}