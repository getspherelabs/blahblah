package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class HackerPath(override val value: String) : Path {
    Abbreviation("hacker.abbreviation"),
    Adjective("hacker.adjective"),
    Noun("hacker.noun"),
    Action("hacker.verb")
}
