package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.CatPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class CatModule(
    private val provider: Provider
) {
    public val name: Name get() = Name(provider.get(CatPath.Name))
    public val breed: Breed get() = Breed(provider.get(CatPath.Breed))
    public val registry: Registry get() = Registry(provider.get(CatPath.Registry))
}

@JvmInline
public value class Breed(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Registry(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun catModule(yamlProvider: () -> YamlProvider): CatModule {
    return CatModule(
        provider = provider {
            type(ProviderType.Cat)
            yamlProvider(yamlProvider())
        }
    )
}
