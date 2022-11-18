plugins {
    id("itube.android.feature")
    id("itube.android.library.compose")
    id("itube.android.library.jacoco")
}

android {
    namespace = "org.elveselimoski.itube.feature.trending"
}

dependencies {
    implementation(libs.kotlinx.datetime)
}
