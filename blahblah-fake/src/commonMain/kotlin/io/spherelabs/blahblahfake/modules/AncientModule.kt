package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.AncientPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class AncientModule(
    private val provider: Provider
) {
    public val titan: Titan get() = Titan(provider.get(AncientPath.Titan))
    public val hero: Hero get() = Hero(provider.get(AncientPath.Hero))
}

internal fun ancientModule(yamlProvider: () -> YamlProvider): AncientModule {
    return AncientModule(
        provider = provider {
            type(ProviderType.Ancient)
            yamlProvider(yamlProvider())
        }
    )
}

@JvmInline
public value class Titan(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Hero(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
