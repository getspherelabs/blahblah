package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.PokemonPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class PokemonModule(
    private val provider: Provider
) {
    public val name: Name get() = Name(provider.get(PokemonPath.Name))
    public val location: Location get() = Location(provider.get(PokemonPath.Location))
}

@JvmInline
public value class Location(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun pokemonModule(yamlProvider: () -> YamlProvider): PokemonModule {
    return PokemonModule(provider = provider {
        type(ProviderType.Pokemon)
        yamlProvider(yamlProvider())
    })
}
