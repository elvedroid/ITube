plugins {
    id("itube.android.library")
    id("itube.android.library.compose")
    id("itube.android.library.jacoco")
}

android {
    namespace = "org.elveselimoski.core.ui"
}

dependencies {
    implementation(project(":core:designsystem"))
    implementation(project(":core:model"))

    implementation(libs.androidx.core.ktx)
}
