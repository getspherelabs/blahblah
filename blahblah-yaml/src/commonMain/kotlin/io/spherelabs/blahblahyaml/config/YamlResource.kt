package io.spherelabs.blahblahyaml.config

/**
 * [YamlResource] represents the structure of a YAML resource, where the outer map represents
 * sections, and the inner map represents key-value pairs within those sections.
 */
internal typealias YamlResource = LinkedHashMap<String, LinkedHashMap<String, String>>
