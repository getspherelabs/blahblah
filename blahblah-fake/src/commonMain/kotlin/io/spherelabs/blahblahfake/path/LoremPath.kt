package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class LoremPath(override val value: String) : Path {
    Words("lorem.words"),
    Supplemental("lorem.supplemental")
}
