package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.SpacePath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

class SpaceModule(
    private val provider: Provider
) {
    val planet: Planet get() = Planet(provider.get(SpacePath.Planet))
    val moon: Moon get() = Moon(provider.get(SpacePath.Moon))
    val galaxy: Galaxy get() = Galaxy(provider.get(SpacePath.Galaxy))
    val nebula: Nebula get() = Nebula(provider.get(SpacePath.Nebula))
    val star: Star get() = Star(provider.get(SpacePath.Star))
    val cluster: Cluster get() = Cluster(provider.get(SpacePath.Cluster))
    val constellation: Constellation get() = Constellation(provider.get(SpacePath.Constellation))
    val agency: Agency get() = Agency(provider.get(SpacePath.Agency))
    val agencyAbr: AgencyAbr get() = AgencyAbr(provider.get(SpacePath.AgencyAbr))
    val company: Company get() = Company(provider.get(SpacePath.Company))
    val measurement: Measurement get() = Measurement(provider.get(SpacePath.Measurement))
    val meteor: Meteor get() = Meteor(provider.get(SpacePath.Meteor))
}

@JvmInline
value class Planet(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Moon(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Galaxy(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Nebula(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Star(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Cluster(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}



@JvmInline
value class Constellation(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Agency (
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class AgencyAbr(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class SpaceCraft(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Company(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Measurement(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Meteor(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun spaceModule(yamlProvider: () -> YamlProvider): SpaceModule {
    return SpaceModule(provider = provider {
        type(ProviderType.Space)
        yamlProvider(yamlProvider())
    })
}