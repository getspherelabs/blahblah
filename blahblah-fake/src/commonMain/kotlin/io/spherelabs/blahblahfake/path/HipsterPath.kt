package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class HipsterPath(override val value: String) : Path {
    Words("hipster.words")
}
