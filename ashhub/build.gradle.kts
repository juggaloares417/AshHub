plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
}
android {
  namespace = "com.ash.ashhub"
  compileSdk = 34
  defaultConfig {
    applicationId = "com.ash.ashhub"
    minSdk = 24
    targetSdk = 34
    versionCode = 1
    versionName = "0.1.0"
  }
  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      // proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
}
dependencies {
  implementation("androidx.activity:activity-ktx:1.9.2")
  implementation("androidx.core:core-ktx:1.13.1")
  implementation("androidx.appcompat:appcompat:1.7.0")
}
