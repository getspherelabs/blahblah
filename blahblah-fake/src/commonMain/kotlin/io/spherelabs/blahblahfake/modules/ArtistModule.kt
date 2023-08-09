package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.ArtistPath
import io.spherelabs.blahblahfake.provider.Provider

class ArtistModule(
    private val provider: Provider
) {
    val name: Name get() =  Name(provider.get(ArtistPath.Name))
}


