plugins {
    alias(libs.plugins.jvm)
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.jcommander)
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
