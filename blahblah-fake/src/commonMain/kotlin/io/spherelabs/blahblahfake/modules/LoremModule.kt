package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.LoremPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

public class LoremModule(
    private val provider: Provider
) {
    public val words: Words get() = Words(provider.get(LoremPath.Words))
    public val supplemental: Supplemental get() = Supplemental(provider.get(LoremPath.Supplemental))
}

@JvmInline
public value class Words(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Supplemental(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
