package io.spherelabs.blahblahyaml.parser

import io.spherelabs.blahblahyaml.config.YamlResource

/**
 * [YamlParser] for parsing YAML files and retrieving values organized in a specific structure.
 */
interface YamlParser {
    /**
     * Parses the YAML file and returns values as a nested LinkedHashMap.
     *
     * @return A nested LinkedHashMap where the outer map represents sections, and the inner map represents key-value pairs.
     */
    fun values(): YamlResource
}

