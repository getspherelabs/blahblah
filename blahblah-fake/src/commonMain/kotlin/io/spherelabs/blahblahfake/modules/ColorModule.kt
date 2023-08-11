package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.ColorPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

public class ColorModule(
    private val provider: Provider
) {
    public val name: Name get() = Name(provider.get(ColorPath.Name))
    public val safeColor: SafeColor get() = SafeColor(provider.get(ColorPath.SafeColor))
}

@JvmInline
public value class SafeColor(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
