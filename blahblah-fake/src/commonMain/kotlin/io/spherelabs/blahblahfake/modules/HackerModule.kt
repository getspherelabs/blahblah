package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.HackerPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class HackerModule(
    private val provider: Provider
) {
    public val abbreviation: Abbreviation get() = Abbreviation(provider.get(HackerPath.Abbreviation))
    public val adjective: Adjective get() = Adjective(provider.get(HackerPath.Adjective))
    public val noun: Noun get() = Noun(provider.get(HackerPath.Noun))
    public val action: Action get() = Action(provider.get(HackerPath.Action))
}

@JvmInline
public value class Action(
    private val value: String
) {
    override fun toString(): String {
        return super.toString()
    }
}

internal fun hackerModule(yamlProvider: () -> YamlProvider): HackerModule {
    return HackerModule(
        provider = provider {
            type(ProviderType.Hacker)
            yamlProvider(yamlProvider())
        }
    )
}
