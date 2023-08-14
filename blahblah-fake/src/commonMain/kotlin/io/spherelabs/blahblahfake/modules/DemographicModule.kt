package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.DemographicPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class DemographicModule(
    private val provider: Provider
) {
    public val race: Race get() = Race(provider.get(DemographicPath.Race))
    public val sex: Sex get() = Sex(provider.get(DemographicPath.Sex))
    public val demonym: Demonym get() = Demonym(provider.get(DemographicPath.Demonym))
    public val educationalAttainment: EducationalAttainment get() = EducationalAttainment(
        provider.get(DemographicPath.EducationalAttainment)
    )
    public val maritalStatus: MaritalStatus get() = MaritalStatus(provider.get(DemographicPath.MaritalStatus))
}

@JvmInline
public value class Race(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Sex(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Demonym(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class EducationalAttainment(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class MaritalStatus(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun demographicModule(yamlProvider: () -> YamlProvider): DemographicModule {
    return DemographicModule(
        provider = provider {
            type(ProviderType.Demographic)
            yamlProvider(yamlProvider())
        }
    )
}
