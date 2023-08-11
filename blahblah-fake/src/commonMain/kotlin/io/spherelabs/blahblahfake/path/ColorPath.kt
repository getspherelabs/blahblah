package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class ColorPath(override val value: String) : Path {
    Name("color.all_color_names"),
    SafeColor("color.safe_color_names")
}
