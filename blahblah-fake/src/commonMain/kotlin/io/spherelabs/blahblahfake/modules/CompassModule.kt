package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.CompassPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

public class CompassModule(
    private val provider: Provider
) {
    public val direction: Direction get() = Direction(provider.get(CompassPath.Direction))
    public val abbreviation: Abbreviation get() = Abbreviation(provider.get(CompassPath.Abbreviation))
    public val azimuth: Azimuth get() = Azimuth(provider.get(CompassPath.Azimuth))
}

@JvmInline
public value class Direction(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Abbreviation(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Azimuth(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
