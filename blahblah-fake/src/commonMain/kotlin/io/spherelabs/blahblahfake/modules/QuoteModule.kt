package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.QuotePath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class QuoteModule(
    private val provider: Provider
) {
    public val random: Random get() = Random(provider.get(QuotePath.Random))
}

@JvmInline
public value class Random(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun quoteModule(yamlProvider: () -> YamlProvider): QuoteModule {
    return QuoteModule(
        provider = provider {
            type(ProviderType.Quote)
            yamlProvider(yamlProvider())
        }
    )
}
