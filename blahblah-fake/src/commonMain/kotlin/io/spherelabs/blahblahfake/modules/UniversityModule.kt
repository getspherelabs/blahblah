package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.UniversityPath
import io.spherelabs.blahblahfake.provider.Provider

public class UniversityModule(
    private val provider: Provider
) {
    public val name: Name get() = Name(provider.get(UniversityPath.Name))
}
