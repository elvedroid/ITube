// TODO: Remove once https://youtrack.jetbrains.com/issue/KTIJ-19369 is fixed
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("itube.android.library")
    id("itube.android.library.jacoco")
    id("itube.android.hilt")
}

android {
    namespace = "org.elveselimoski.itube.core.navigation"
}

dependencies {
    api(libs.androidx.hilt.navigation.compose)
    api(libs.androidx.navigation.compose)
}
