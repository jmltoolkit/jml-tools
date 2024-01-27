plugins {
    alias(libs.plugins.jvm)
    `java-library`
}

repositories {
    maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/")
    mavenCentral()
}

dependencies {
    api(libs.jmlcore)
    api(libs.jmlsymbol)
    implementation(project(":utils"))
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
