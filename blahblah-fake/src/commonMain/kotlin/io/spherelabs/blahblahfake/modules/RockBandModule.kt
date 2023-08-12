package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.RockBandPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider

public class RockBandModule(
    private val provider: Provider
) {
    public val name: Name get() = Name(provider.get(RockBandPath.Name))
}

internal fun rockBandModule(yamlProvider: () -> YamlProvider): RockBandModule {
    return RockBandModule(
        provider = provider {
            type(ProviderType.RockBand)
            yamlProvider(yamlProvider())
        }
    )
}
