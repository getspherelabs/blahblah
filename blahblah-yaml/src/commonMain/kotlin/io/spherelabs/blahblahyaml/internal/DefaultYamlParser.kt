package io.spherelabs.blahblahyaml.internal

import io.spherelabs.blahblahresource.Resource
import io.spherelabs.blahblahyaml.parser.YamlParser
import net.mamoe.yamlkt.Yaml

/**
 * Default implementation of the YamlParser interface.
 *
 * @param yaml The YAML parser instance used for decoding YAML content.
 * @param locale The desired locale for extracting values from the YAML content.
 * @param path The file path to the YAML file to be parsed.
 * @param sectionKey The key representing the section within the YAML content.
 */
internal class DefaultYamlParser(
    private val yaml: Yaml,
    private val locale: String,
    private val path: String,
    private val sectionKey: String
) : YamlParser {

    override fun values(): LinkedHashMap<String, LinkedHashMap<String, String>> {
        // Read YAML content from the file
        val yamlFile = Resource().read(path)

        // Decode YAML content into a map
        val yamlValuesDefault = yaml.decodeMapFromString(yamlFile) as Map<*, *>

        // Get locale-specific values
        val localeValuesDefault = yamlValuesDefault[locale] as Map<*, *>

        return localeValuesDefault[sectionKey] as LinkedHashMap<String, LinkedHashMap<String, String>>
    }
}
