package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.CompanyPath
import io.spherelabs.blahblahfake.path.CompassPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

class CompassModule(
    private val provider: Provider
) {
    val direction: Direction get() = Direction(provider.get(CompassPath.Direction))
    val abbreviation: Abbreviation get() = Abbreviation(provider.get(CompassPath.Abbreviation))
    val azimuth: Azimuth get() = Azimuth(provider.get(CompassPath.Azimuth))
}

@JvmInline
value class Direction(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Abbreviation(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Azimuth(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}