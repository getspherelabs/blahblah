package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class TwinPeaksPath(override val value: String) : Path {
    Character("twin_peaks.characters"),
    Location("twin_peaks.locations"),
    Quote("twin_peaks.quotes")
}
