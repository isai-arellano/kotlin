package com.isai_arellano.helloworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform