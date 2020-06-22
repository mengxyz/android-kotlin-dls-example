import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id(PlugIns.Application)
    kotlin(PlugIns.Android)
}

android {
    compileSdkVersion(30)
    buildToolsVersion =  Android.BuildTools

    defaultConfig {
        applicationId = "com.mengxyz.kotlindls"
        minSdkVersion (16)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility =  JavaVersion.VERSION_1_8
        targetCompatibility =  JavaVersion.VERSION_1_8
    }
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions.apply {
         jvmTarget = "1.8"
        }
    }
}

dependencies {

    implementation(kotlin("stdlib"))
    implementation(Libs.KTX)
    implementation(Libs.AppCompat)
    implementation(Libs.Material)
    implementation(Libs.ConstrainLayout)

    testImplementation(TestLibs.Junit)
    androidTestImplementation(TestLibs.AndroidXJunit)
    androidTestImplementation(TestLibs.AndroidXEspresso)
}