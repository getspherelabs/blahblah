package io.spherelabs.blahblahfake.internal

inline fun resolver(crossinline action: () -> String): String {
    return action()
}

