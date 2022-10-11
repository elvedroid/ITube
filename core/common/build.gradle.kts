plugins {
    id("itube.android.library")
    id("itube.android.library.jacoco")
    id("itube.android.hilt")
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}