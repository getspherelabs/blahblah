package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.HipsterPath
import io.spherelabs.blahblahfake.provider.Provider

class HipsterModule(
    private val provider: Provider
) {
    val words: Words get() = Words(provider.get(HipsterPath.Words))
}
