package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class AddressPath(override val value: String) : Path {
    Country("address.country"),
    State("address.state"),
    City("address.city"),
    StreetAddress("address.street_address"),
    ZipCode("address.zipcode"),
    BuildingNumber("address.building_number"),
    StateAbbreviation("state_abbr")
}
