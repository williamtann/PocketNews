object Library {
    // Core
    const val ktx = "androidx.core:core-ktx:${Version.ktx}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"
    const val activity = "androidx.activity:activity-compose:${Version.activity}"

    // Compose
    const val composeUi = "androidx.compose.ui:ui:${Version.composeUi}"
    const val composeUiPreview = "androidx.compose.ui:ui-tooling-preview:${Version.composeUi}"
    const val composeMaterial = "androidx.compose.material:material:${Version.composeMaterial}"

    // Dagger - Hilt
    const val hilt = "com.google.dagger:hilt-android:${Version.hilt}"
    const val hiltAnnotationCompiler = "com.google.dagger:hilt-android-compiler:${Version.hilt}"

    // Testing
    const val junit = "junit:junit:${Version.junit}"
    const val androidJunitExt = "androidx.test.ext:junit:${Version.androidJunitExt}"
    const val espresso = "androidx.test.espresso:espresso-core:${Version.espresso}"
    const val composeUiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Version.composeUi}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Version.composeUi}"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest:${Version.composeUi}"
}