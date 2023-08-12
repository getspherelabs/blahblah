package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class YodaPath(override val value: String) : Path {
    Quote("yoda.quotes")
}
