package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.JobPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class JobModule(
    private val provider: Provider
) {
    public val title: Title get() = Title(provider.get(JobPath.Title))
    public val position: Position get() = Position(provider.get(JobPath.Position))
    public val field: Field get() = Field(provider.get(JobPath.Field))
    public val skill: Skill get() = Skill(provider.get(JobPath.Skill))
}

internal fun jobModule(yamlProvider: () -> YamlProvider): JobModule {
    return JobModule(
        provider = provider {
            type(ProviderType.Job)
            yamlProvider(yamlProvider())
        }
    )
}

@JvmInline
public value class Field(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Position(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Skill(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
