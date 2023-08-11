package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class SuperHeroPath (override val value: String): Path {
    Name("superhero.name")
}
