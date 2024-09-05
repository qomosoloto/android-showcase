plugins {
    id("local.detekt")
    id("local.spotless")
    alias(libs.plugins.kotlin.compose.compiler) apply false
}
