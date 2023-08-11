package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class FoodPath (override val value: String) : Path {
    Ingredient("food.ingredients"),
    Spice("food.spices"),
    Measurement("food.measurements"),
    Size("food.measurement_sizes")
}
