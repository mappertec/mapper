plugins {
    `kotlin-dsl`
    `maven-publish`
}

group = "dev.mapper"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io")}
}

dependencies {
    implementation("com.google.code.gson:gson:2.10.1")
}

kotlin {
    jvmToolchain(8)
}