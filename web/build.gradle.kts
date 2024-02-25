plugins {
    id("standard-kotlin")
}

group = "io.github.jmltoolkit"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    api(libs.jmlcore)
    api(libs.jmlsymbol)

    implementation(libs.ktor.core)
    implementation(libs.ktor.html)
    implementation(libs.ktor.netty)
    implementation(libs.logback)
}
