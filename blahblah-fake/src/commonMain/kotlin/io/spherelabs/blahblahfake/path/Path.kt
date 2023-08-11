package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

/**
 * [Path] representing a path to a resource.
 */
@BlahBlahInternalApi
public interface Path {
    /**
     * The value of the path.
     */
    public val value: String
}
