package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.SuperHeroPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider

public class SuperHeroModule(
    private val provider: Provider
) {
    public val name: Name get() = Name(provider.get(SuperHeroPath.Name))
}

internal fun superHeroModule(yamlProvider: () -> YamlProvider): SuperHeroModule {
    return SuperHeroModule(
        provider = provider {
            type(ProviderType.SuperHero)
            yamlProvider(yamlProvider())
        }
    )
}
