package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.LordOfTheRingsPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider

public class LordOfTheRingsModule(
    private val provider: Provider
) {
    public val character: Character get() = Character(provider.get(LordOfTheRingsPath.Character))
    public val location: Location get() = Location(provider.get(LordOfTheRingsPath.Location))
}

internal fun lordOfTheRingsModule(yamlProvider: () -> YamlProvider): LordOfTheRingsModule {
    return LordOfTheRingsModule(
        provider = provider {
            type(ProviderType.LordOfTheRings)
            yamlProvider(yamlProvider())
        }
    )
}
