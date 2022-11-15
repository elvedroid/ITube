plugins {
    id("itube.android.library")
    id("itube.android.library.jacoco")
    id("itube.android.hilt")
}

android {
    namespace = "org.elveselimoski.core.common"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
    testImplementation(project(":core:testing"))
}
