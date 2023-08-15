package io.spherelabs.blahblahkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
