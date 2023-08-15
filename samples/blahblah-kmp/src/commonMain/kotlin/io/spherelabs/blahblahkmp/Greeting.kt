package io.spherelabs.blahblahkmp

import io.spherelabs.blahblahfake.internal.blah

class Greeting {
    private val platform: Platform = getPlatform()
    private val blah = blah()

    fun greet(): String {
        return "${blah.address.city}"
    }
}
