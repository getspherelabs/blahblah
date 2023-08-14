package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.RickyAndMortyPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider

public class RickyAndMortyModule(
    private val provider: Provider
) {
    public val character: Character get() = Character(provider.get(RickyAndMortyPath.Character))
    public val location: Location get() = Location(provider.get(RickyAndMortyPath.Location))
    public val quote: Quote get() = Quote(provider.get(RickyAndMortyPath.Quotes))
}

internal fun rickyAndMortyModule(yamlProvider: () -> YamlProvider): RickyAndMortyModule {
    return RickyAndMortyModule(
        provider = provider {
            type(ProviderType.Friends)
            yamlProvider(yamlProvider())
        }
    )
}
