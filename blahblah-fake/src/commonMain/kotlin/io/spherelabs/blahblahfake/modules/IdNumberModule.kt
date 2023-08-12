package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.IdNumberPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class IdNumberModule(
    private val provider: Provider
) {
    public val valid: Valid get() = Valid(provider.get(IdNumberPath.Valid))
    public val invalid: Invalid get() = Invalid(provider.get(IdNumberPath.Invalid))
}

@JvmInline
public value class Valid(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Invalid(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun idNumberModule(yamlProvider: () -> YamlProvider): IdNumberModule {
    return IdNumberModule(
        provider = provider {
            type(ProviderType.IdNumber)
            yamlProvider(yamlProvider())
        }
    )
}
