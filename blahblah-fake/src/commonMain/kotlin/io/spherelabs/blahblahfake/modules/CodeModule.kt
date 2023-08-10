package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.CodePath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

class CodeModule(
    private val provider: Provider
) {
    val asin: Asin get() = Asin(provider.get(CodePath.Asin))
}

@JvmInline
value class Asin(
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