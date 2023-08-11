package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.NamePath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

public class NameModule(
    private val provider: Provider
) {
    public val name: Name get() = Name(provider.get(NamePath.Name))
    public val middleName: MiddleName get() = MiddleName(provider.get(NamePath.NameWithMiddle))
}

@JvmInline
public value class MiddleName(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
