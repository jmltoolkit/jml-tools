plugins {
    alias(libs.plugins.jvm)
    `java-library`
}

repositories {
    mavenCentral()
    maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    implementation(libs.clickt)
    implementation(libs.jmlcore)
    implementation(project(":wd"))
    implementation(project(":xpath"))
    implementation(project(":prettyprinting"))
    implementation(project(":lint"))
    implementation(project(":stat"))
    implementation(project(":jml2java"))
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useKotlinTest("1.9.20")
        }
    }
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
