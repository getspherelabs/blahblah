package io.spherelabs.blahblahyaml.provider

import io.spherelabs.blahblahyaml.exception.ResourceNotFoundException

/**
 * [YamlProvider] for providing values fetched from YAML resources using specified keys.
 */
public interface YamlProvider {
    /**
     * Retrieves a value associated with the provided key from the YAML resource.
     *
     * @param key The key to retrieve the value for.
     * @return The value associated with the key.
     * @throws ResourceNotFoundException If the requested key or its value is not found.
     */
    public fun get(key: String): String
}


