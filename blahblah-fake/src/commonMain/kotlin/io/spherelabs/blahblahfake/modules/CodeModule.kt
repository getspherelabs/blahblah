package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.CodePath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class CodeModule(
    private val provider: Provider
) {
    public val asin: Asin get() = Asin(provider.get(CodePath.Asin))
}

@JvmInline
public value class Asin(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun codeModule(yamlProvider: () -> YamlProvider): CodeModule {
    return CodeModule(provider = provider {
        type(ProviderType.Code)
        yamlProvider(yamlProvider())
    })
}
