plugins {
    id("standard-kotlin")

}

dependencies {
    api(project(":utils"))
    testImplementation(libs.snakeyaml)
    testImplementation(kotlin("serialization"))
}
