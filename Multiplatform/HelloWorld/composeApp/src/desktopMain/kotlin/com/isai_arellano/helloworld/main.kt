package com.isai_arellano.helloworld

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "HelloWorld",
    ) {
        App()
    }
}