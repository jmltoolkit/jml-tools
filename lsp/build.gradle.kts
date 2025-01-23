plugins {
    id("standard-kotlin")
    kotlin("plugin.serialization") version libs.versions.kotlin.get()
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("application")
}

version = "1.0-SNAPSHOT"

dependencies {
    api(libs.jmlcore)
    api(libs.jmlsymbol)

    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.6.2")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")
    //implementation(kotlin("serialization"))

    implementation(project(":utils"))
    implementation(project(":smt"))
    implementation(project(":wd"))
    implementation(project(":stat"))
    implementation(project(":redux"))
    implementation(project(":lint"))
    implementation(project(":jml2java"))

    implementation("org.tinylog:tinylog-api-kotlin:2.5.0")
    implementation("org.tinylog:tinylog-api:2.5.0-M2.1")
    implementation("org.tinylog:tinylog-impl:2.5.0")

    implementation("org.eclipse.lsp4j:org.eclipse.lsp4j:0.23.1")

    implementation(libs.clickt)

    implementation("org.key-project:key.core:2.12.3")
    implementation("org.key-project:key.ui:2.12.3")

    //implementation("org.apache.groovy:groovy:4.0.6")
}

application {
    mainClass = "io.github.jmltoolkit.lsp.Main"
}