package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.AppPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

public class AppModule(
    private val provider: Provider
) {
    public val name: Name get() = Name(provider.get(AppPath.Name))
    public val author: Author get() = Author(provider.get(AppPath.Author))
    public val version: Version get() = Version(provider.get(AppPath.Version))
}

@JvmInline
public value class Version(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Author(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}


