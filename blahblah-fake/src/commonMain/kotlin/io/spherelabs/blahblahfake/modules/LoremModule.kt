package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.LoremPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

class LoremModule(
    private val provider: Provider
) {
    val words: Words get() = Words(provider.get(LoremPath.Words))
    val supplemental: Supplemental get() = Supplemental(provider.get(LoremPath.Supplemental))
}

@JvmInline
value class Words(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Supplemental(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

