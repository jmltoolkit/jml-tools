plugins {
    id("standard-kotlin")
}

dependencies {
    api(libs.jmlcore)
    api(libs.jmlsymbol)
    api(libs.gson)
    implementation(libs.logback)
    implementation("se.bjurr.violations:violations-lib:1.159.1")

    testImplementation(project(":utils"))
}
