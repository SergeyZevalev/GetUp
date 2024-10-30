plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("kotlin-kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies{

    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.common)
    implementation(project(":domain"))
    annotationProcessor(libs.androidx.room.compiler)
    implementation(libs.androidx.room.ktx)
}