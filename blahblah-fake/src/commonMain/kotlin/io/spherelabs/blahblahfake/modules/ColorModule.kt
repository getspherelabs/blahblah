package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.ColorPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

class ColorModule(
    private val provider: Provider
) {
    val name: Name get() = Name(provider.get(ColorPath.Name))
    val safeColor: SafeColor get() = SafeColor(provider.get(ColorPath.SafeColor))
}

@JvmInline
value class SafeColor(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}