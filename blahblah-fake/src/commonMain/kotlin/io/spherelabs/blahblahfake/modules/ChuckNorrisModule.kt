package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.ChuckNorrisPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class ChuckNorrisModule(
    private val provider: Provider
) {
    public val fact: Fact get() = Fact(provider.get(ChuckNorrisPath.Fact))
}

@JvmInline
public value class Fact(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun chuckNorrisModule(yamlProvider: () -> YamlProvider): ChuckNorrisModule {
    return ChuckNorrisModule(provider = provider {
        type(ProviderType.ChuckNorris)
        yamlProvider(yamlProvider())
    })
}
