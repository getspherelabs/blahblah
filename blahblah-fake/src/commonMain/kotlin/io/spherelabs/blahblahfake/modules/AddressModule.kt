package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.AddressPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

public class AddressModule(
    private val provider: Provider
) {
    public val city: City get() = City(provider.get(AddressPath.City))
    public val country: Country get() = Country(provider.get(AddressPath.Country))
    public val state: State get() = State(provider.get(AddressPath.State))
    public val streetAddress: StreetAddress get() = StreetAddress(provider.get(AddressPath.StreetAddress))
    public val zipCode: ZipCode get() = ZipCode(provider.get(AddressPath.ZipCode))
    public val buildingNumber: BuildingNumber get() = BuildingNumber(provider.get(AddressPath.BuildingNumber))
    public val stateAbbreviation: StateAbbreviation get() = StateAbbreviation(provider.get(AddressPath.StateAbbreviation))
}


@JvmInline
public value class City(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Country(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class State(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}


@JvmInline
public value class StreetAddress(
    private val value: String
) {
    override fun toString(): String {
        return value
    }

    public  fun isDigit(): Boolean {
        return value.any { it.isDigit() }
    }
}

@JvmInline
public value class ZipCode(
    private val value: String
) {
    override fun toString(): String {
        return value
    }

    public fun isDigit(): Boolean {
        return value.any { it.isDigit() }
    }
}

@JvmInline
public value class BuildingNumber(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}


@JvmInline
public value class StateAbbreviation(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
