package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class AppPath(override val value: String) : Path {
    Author("app.author"),
    Version("app.version"),
    Name("app.name")
}
