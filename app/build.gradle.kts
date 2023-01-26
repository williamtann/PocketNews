plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("kotlin-parcelize")
}

android {
    namespace = "com.willtan.pocketnews"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.willtan.pocketnews"
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Core
    implementation(Library.ktx)
    implementation(Library.lifecycleRuntime)
    implementation(Library.activity)

    // Compose
    implementation(Library.composeUi)
    implementation(Library.composeUiPreview)
    implementation(Library.composeMaterial)

    // Dagger - Hilt
    implementation(Library.hilt)
    kapt(Library.hiltAnnotationCompiler)

    // Testing
    testImplementation(Library.junit)
    testImplementation(Library.composeUiTooling)
    testImplementation(Library.composeUiTestManifest)

    androidTestImplementation(Library.androidJunitExt)
    androidTestImplementation(Library.espresso)
    androidTestImplementation(Library.composeUiTestJunit4)
}