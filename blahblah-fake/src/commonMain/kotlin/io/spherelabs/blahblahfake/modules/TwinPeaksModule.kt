package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.TwinPeaksPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider

public class TwinPeaksModule(
    private val provider: Provider
) {
    public val character: Character get() = Character(provider.get(TwinPeaksPath.Character))
    public val location: Location get() = Location(provider.get(TwinPeaksPath.Location))
    public val quote: Quote get() = Quote(provider.get(TwinPeaksPath.Quote))
}

internal fun twinPeaksModule(yamlProvider: () -> YamlProvider): TwinPeaksModule {
    return TwinPeaksModule(provider = provider {
        type(ProviderType.TwinPeaks)
        yamlProvider(yamlProvider())
    })
}
