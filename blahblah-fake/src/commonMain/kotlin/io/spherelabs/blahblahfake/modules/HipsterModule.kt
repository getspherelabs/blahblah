package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.HipsterPath
import io.spherelabs.blahblahfake.provider.Provider

public class HipsterModule(
    private val provider: Provider
) {
    public  val words: Words get() = Words(provider.get(HipsterPath.Words))
}
