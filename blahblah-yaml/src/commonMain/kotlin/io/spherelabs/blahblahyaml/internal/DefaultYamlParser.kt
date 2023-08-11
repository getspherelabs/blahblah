package io.spherelabs.blahblahyaml.internal

import io.spherelabs.blahblahyaml.config.YamlResource
import io.spherelabs.blahblahyaml.parser.YamlParser
import io.spherelabs.blahblahyaml.readPath
import net.mamoe.yamlkt.Yaml
import okio.Path.Companion.toPath

/**
 * Default implementation of the YamlParser interface.
 *
 * @param yaml The YAML parser instance used for decoding YAML content.
 * @param locale The desired locale for extracting values from the YAML content.
 * @param path The file path to the YAML file to be parsed.
 * @param sectionKey The key representing the section within the YAML content.
 */
class DefaultYamlParser(
    private val yaml: Yaml,
    private val locale: String,
    private val path: String,
    private val sectionKey: String
) : YamlParser {

    override fun values(): YamlResource {
        // Read YAML content from the file
        val yamlFile = readPath(path.toPath())

        // Decode YAML content into a map
        val yamlValuesDefault = yaml.decodeMapFromString(yamlFile) as Map<*, *>

        // Get locale-specific values
        val localeValuesDefault = yamlValuesDefault[locale] as Map<*, *>

        return localeValuesDefault[sectionKey] as YamlResource
    }
}
