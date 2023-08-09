package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.NamePath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

class NameModule(
    private val provider: Provider
) {
    val name: Name get() = Name(provider.get(NamePath.Name))
    val middleName: MiddleName get() = MiddleName(provider.get(NamePath.NameWithMiddle))
}

@JvmInline
value class MiddleName(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}