plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("com.google.devtools.ksp")
    id ("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.studyfocus"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.studyfocus"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

    dependencies {

        implementation("androidx.core:core-ktx:1.12.0")
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
        implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.2")
        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
        implementation("androidx.compose.runtime:runtime-livedata:1.5.4")
        implementation("androidx.activity:activity-compose:1.8.2")
        implementation(platform("androidx.compose:compose-bom:2023.10.01"))
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-graphics")
        implementation("androidx.compose.ui:ui-tooling-preview")
        implementation("androidx.compose.material3:material3")
        implementation("androidx.datastore:datastore-preferences-core:1.0.0")
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        androidTestImplementation(platform("androidx.compose:compose-bom:2023.10.01"))
        androidTestImplementation("androidx.compose.ui:ui-test-junit4")
        debugImplementation("androidx.compose.ui:ui-tooling")
        debugImplementation("androidx.compose.ui:ui-test-manifest")
        implementation("androidx.compose.material3:material3:1.1.2")
        implementation ("androidx.compose.ui:ui:1.5.4")
        implementation ("androidx.compose.material3:material3:1.2.0-beta01")
        //implementation ("io.coil-kt:coil-compose:2.3.0")
        implementation ("androidx.compose.material3:material3-window-size-class:1.2.0-beta01")
        implementation("androidx.multidex:multidex:2.0.1")

        // Datastore
        implementation("androidx.datastore:datastore:1.0.0")
        implementation("androidx.datastore:datastore-preferences:1.0.0")


        // ViewModel Compose
        implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")

        // Dagger Hilt
        implementation("com.google.dagger:hilt-android:2.50")
        kapt("com.google.dagger:hilt-android-compiler:2.50")
        //implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
        kapt("androidx.hilt:hilt-compiler:1.1.0")
        implementation("androidx.hilt:hilt-navigation-compose:1.1.0")


        val room_version = "2.6.1"

        implementation("androidx.room:room-runtime:$room_version")
        //kapt("androidx.room:room-compiler:$room_version")

        //kapt ("androidx.room:room-compiler:$room_version")
        // To use Kotlin Symbol Processing (KSP)
        ksp("androidx.room:room-compiler:$room_version")

        // optional - Kotlin Extensions and Coroutines support for Room
        implementation("androidx.room:room-ktx:$room_version")

        // optional - Test helpers
        testImplementation("androidx.room:room-testing:$room_version")

        // optional - Paging 3 Integration
        implementation("androidx.room:room-paging:$room_version")
    }

