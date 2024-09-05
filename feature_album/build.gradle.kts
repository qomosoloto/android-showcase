plugins {
    id("local.library")
    alias(libs.plugins.kotlin.compose.compiler)
}

android {
    namespace = "com.igorwojda.showcase.album"
}

dependencies {
    implementation(projects.featureBase)

    ksp(libs.roomCompiler)

    testImplementation(projects.libraryTestUtils)
    testImplementation(libs.bundles.test)

    testRuntimeOnly(libs.junitJupiterEngine)
}
