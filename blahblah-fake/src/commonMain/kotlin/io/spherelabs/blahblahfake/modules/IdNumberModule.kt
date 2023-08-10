package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.IdNumberPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

class IdNumberModule(
    private val provider: Provider
) {
    val valid: Valid get() = Valid(provider.get(IdNumberPath.Valid))
    val invalid: Invalid get() = Invalid(provider.get(IdNumberPath.Invalid))
}

@JvmInline
value class Valid(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Invalid(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}


internal fun idNumberModule(yamlProvider: () -> YamlProvider): IdNumberModule {
    return IdNumberModule(provider = provider {
        type(ProviderType.IdNumber)
        yamlProvider(yamlProvider())
    })
}