package com.isai_arellano.navigationkmp.navigationkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform