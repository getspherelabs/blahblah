package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class ArtistPath(override val value: String) : Path {
    Name("artist.names")
}
