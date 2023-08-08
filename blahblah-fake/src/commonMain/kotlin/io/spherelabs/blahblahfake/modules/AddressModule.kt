package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.AddressPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

class AddressModule(
    private val provider: Provider
) {
    val city: City get() = City(provider.get(AddressPath.City))
    val country: Country get() = Country(provider.get(AddressPath.Country))
    val state: State get() = State(provider.get(AddressPath.State))
    val streetAddress: StreetAddress get() = StreetAddress(provider.get(AddressPath.StreetAddress))
    val zipCode: ZipCode get() = ZipCode(provider.get(AddressPath.ZipCode))
    val buildingNumber: BuildingNumber get() = BuildingNumber(provider.get(AddressPath.BuildingNumber))
    val stateAbbreviation: StateAbbreviation get() = StateAbbreviation(provider.get(AddressPath.StateAbbreviation))
}


@JvmInline
value class City(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Country(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class State(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}


@JvmInline
value class StreetAddress(
    private val value: String
) {
    override fun toString(): String {
        return value
    }

    fun isDigit(): Boolean {
        return value.any { it.isDigit() }
    }
}

@JvmInline
value class ZipCode(
    private val value: String
) {
    override fun toString(): String {
        return value
    }

    fun isDigit(): Boolean {
        return value.any { it.isDigit() }
    }
}

@JvmInline
value class BuildingNumber(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}


@JvmInline
value class StateAbbreviation(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}