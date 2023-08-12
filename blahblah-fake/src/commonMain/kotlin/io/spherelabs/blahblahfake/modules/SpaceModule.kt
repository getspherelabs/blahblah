package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.SpacePath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class SpaceModule(
    private val provider: Provider
) {
    public val planet: Planet get() = Planet(provider.get(SpacePath.Planet))
    public val moon: Moon get() = Moon(provider.get(SpacePath.Moon))
    public val galaxy: Galaxy get() = Galaxy(provider.get(SpacePath.Galaxy))
    public val nebula: Nebula get() = Nebula(provider.get(SpacePath.Nebula))
    public val star: Star get() = Star(provider.get(SpacePath.Star))
    public val cluster: Cluster get() = Cluster(provider.get(SpacePath.Cluster))
    public val constellation: Constellation get() = Constellation(provider.get(SpacePath.Constellation))
    public val agency: Agency get() = Agency(provider.get(SpacePath.Agency))
    public val agencyAbr: AgencyAbr get() = AgencyAbr(provider.get(SpacePath.AgencyAbr))
    public val company: Company get() = Company(provider.get(SpacePath.Company))
    public val measurement: Measurement get() = Measurement(provider.get(SpacePath.Measurement))
    public val meteor: Meteor get() = Meteor(provider.get(SpacePath.Meteor))
}

@JvmInline
public value class Planet(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Moon(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Galaxy(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Nebula(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Star(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Cluster(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Constellation(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Agency(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class AgencyAbr(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class SpaceCraft(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Company(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Measurement(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Meteor(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun spaceModule(yamlProvider: () -> YamlProvider): SpaceModule {
    return SpaceModule(
        provider = provider {
            type(ProviderType.Space)
            yamlProvider(yamlProvider())
        }
    )
}
