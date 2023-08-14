package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class DessertPath(override val value: String) : Path {
    Variety("dessert.variety"),
    Topping("dessert.topping"),
    Flavor("dessert.flavor")
}
