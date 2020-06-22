object Dependencies {
    const val Gradle = "com.android.tools.build:gradle:${Versions.Gradle}"
}

object PlugIns {
    const val Android = "android"
    const val Application = "com.android.application"
}

object Versions {
    const val Gradle = "4.1.0-beta01"
    const val Kotlin = "1.3.72"
    const val KTX = "1.2.0"
    const val Appcompat = "1.1.0"
    const val Material = "1.1.0"
    const val ConstrainLayout = "1.1.3"
    const val Junit = "4.13"
    const val AndroidXJunit = "1.1.1"
    const val Espresso = "3.2.0"
}

object Android {
    const val BuildTools = "30.0.0"
}

object Libs {
    const val KTX = "androidx.core:core-ktx:${Versions.KTX}"
    const val AppCompat = "androidx.appcompat:appcompat:${Versions.Appcompat}"
    const val Material = "com.google.android.material:material:${Versions.Material}"
    const val ConstrainLayout = "androidx.constraintlayout:constraintlayout:${Versions.ConstrainLayout}"
}

object TestLibs {
    const val Junit = "junit:junit:${Versions.Junit}"
    const val AndroidXJunit = "androidx.test.ext:junit:${Versions.AndroidXJunit}"
    const val AndroidXEspresso = "androidx.test.espresso:espresso-core:${Versions.Espresso}"
}
