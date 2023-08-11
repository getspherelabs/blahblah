package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class NamePath(override val value: String) : Path {
    Name("name.name"),
    NameWithMiddle("name.name_with_middle")
}
