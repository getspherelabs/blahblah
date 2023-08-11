package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.ZeldaPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider

public class ZeldaModule(
    private val provider: Provider
) {
    public val game: Game get() = Game(provider.get(ZeldaPath.Game))
    public val character: Character get() = Character(provider.get(ZeldaPath.Character))
}

internal fun zeldaModule(yamlProvider: () -> YamlProvider): ZeldaModule {
    return ZeldaModule(provider = provider {
        type(ProviderType.Zelda)
        yamlProvider(yamlProvider())
    })
}
