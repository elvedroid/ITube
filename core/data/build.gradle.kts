plugins {
    id("itube.android.library")
    id("itube.android.library.jacoco")
    id("itube.android.hilt")
    id("kotlinx-serialization")
}

android {
    namespace = "org.elveselimoski.itube.core.data"
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:model"))
    implementation(project(":core:network"))

    testImplementation(project(":core:testing"))

    implementation(libs.androidx.core.ktx)

    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.serialization.json)
}
