package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.AppPath
import io.spherelabs.blahblahfake.provider.Provider

import kotlin.jvm.JvmInline

class AppModule(
    private val provider: Provider
) {
    val name: Name get() = Name(provider.get(AppPath.Name))
    val author: Author get() = Author(provider.get(AppPath.Author))
    val version: Version get() = Version(provider.get(AppPath.Version))
}

@JvmInline
value class Version(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Author(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}


