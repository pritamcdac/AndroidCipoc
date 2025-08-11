plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.cybage.androidciproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.cybage.androidciproject"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false
        }
    }

    buildFeatures {
        viewBinding = true
    }

   dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0") // latest stable
    implementation("com.google.android.material:material:1.12.0") // Material Components
}
}
