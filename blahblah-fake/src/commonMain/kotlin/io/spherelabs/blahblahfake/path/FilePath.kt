package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class FilePath(override val value: String) : Path {
    Extension("file.extension"),
    Type("file.mime_type")
}
