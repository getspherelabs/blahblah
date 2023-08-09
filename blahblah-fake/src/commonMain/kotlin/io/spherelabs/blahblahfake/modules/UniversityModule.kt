package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.UniversityPath
import io.spherelabs.blahblahfake.provider.Provider


class UniversityModule(
    private val provider: Provider
) {
    val name: Name get() =  Name(provider.get(UniversityPath.Name))
}


