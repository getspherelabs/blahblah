package io.spherelabs.blahblahfake.provider

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi
import io.spherelabs.blahblahfake.path.Path

/**
 * [Provider] representing a provider that retrieves content from a specified path.
 */
@BlahBlahInternalApi
public interface Provider {
    /**
     * Retrieves content from the specified path.
     *
     * @param path The path from which content should be retrieved.
     * @return The retrieved content.
     */
    public  fun get(path: Path): String
}
