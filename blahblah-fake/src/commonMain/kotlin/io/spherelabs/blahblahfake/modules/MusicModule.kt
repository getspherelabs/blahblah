package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.MusicPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class MusicModule(
    private val provider: Provider
) {
    public val instrument: Instrument get() = Instrument(provider.get(MusicPath.Instrument))
}

@JvmInline
public value class Instrument(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
internal fun musicModule(yamlProvider: () -> YamlProvider): MusicModule {
    return MusicModule(provider = provider {
        type(ProviderType.Music)
        yamlProvider(yamlProvider())
    })
}
