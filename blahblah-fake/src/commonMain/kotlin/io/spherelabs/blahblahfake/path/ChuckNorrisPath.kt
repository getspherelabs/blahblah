package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class ChuckNorrisPath(override val value: String) : Path {
    Fact("chuck_norris.fact")
}
