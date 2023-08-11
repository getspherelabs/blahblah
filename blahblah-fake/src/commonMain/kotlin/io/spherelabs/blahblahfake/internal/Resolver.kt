package io.spherelabs.blahblahfake.internal

public inline fun resolver(crossinline action: () -> String): String {
    return action()
}

