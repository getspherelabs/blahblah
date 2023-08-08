package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.AnimalPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

class AnimalModule(
    private val provider: Provider
) {
    val name: Name get() = Name(provider.get(AnimalPath.Name))
}


@JvmInline
value class Name(private val value: String) {
    override fun toString(): String {
        return value
    }
}

