package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class AnimalPath(override val value: String) : Path {
    Name("animal.name")
}
