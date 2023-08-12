package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.YodaPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class YodaModule(
    private val provider: Provider
) {
    public val quote: Quote get() = Quote(provider.get(YodaPath.Quote))
}

@JvmInline
public value class Quote(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun yodaModule(yamlProvider: () -> YamlProvider): YodaModule {
    return YodaModule(
        provider = provider {
            type(ProviderType.Yoda)
            yamlProvider(yamlProvider())
        }
    )
}
