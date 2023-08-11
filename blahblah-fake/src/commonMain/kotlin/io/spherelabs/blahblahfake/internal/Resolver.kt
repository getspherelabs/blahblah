package io.spherelabs.blahblahfake.internal

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

/**
 * The [resolver] is a utility function that resolves and returns the result of the provided action.
 *
 * @param action The action to be executed for resolving the result.
 * @return The result of executing the provided action.
 */
@BlahBlahInternalApi
public inline fun resolver(crossinline action: () -> String): String {
    return action()
}

