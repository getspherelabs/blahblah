package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class FriendsPath(override val value: String) : Path {
    Character("friends.characters"),
    Location("friends.locations"),
    Quotes("friends.quotes")
}
