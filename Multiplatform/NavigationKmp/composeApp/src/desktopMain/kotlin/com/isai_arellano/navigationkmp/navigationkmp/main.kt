package com.isai_arellano.navigationkmp.navigationkmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "navigationkmp",
    ) {
        App()
    }
}