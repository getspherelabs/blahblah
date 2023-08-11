package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class MusicPath(override val value: String) : Path {
    Instrument("music.instruments")
}
