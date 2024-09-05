plugins {
    id("local.library")
    alias(libs.plugins.kotlin.compose.compiler)
}

android {
    namespace = "com.igorwojda.showcase.konsistTest"
}

dependencies {
    implementation(projects.featureBase)

    testImplementation(projects.libraryTestUtils)
    testImplementation(libs.bundles.test)

    testRuntimeOnly(libs.junitJupiterEngine)
}
