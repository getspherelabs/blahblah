package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class AncientPath(
    override val value: String
) : Path {
    Titan("ancient.titan"),
    Hero("ancient.hero")
}
