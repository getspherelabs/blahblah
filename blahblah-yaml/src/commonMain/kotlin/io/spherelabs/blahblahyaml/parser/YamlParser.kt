package io.spherelabs.blahblahyaml.parser

import io.spherelabs.blahblahyaml.readPath
import net.mamoe.yamlkt.Yaml
import okio.Path.Companion.toPath

interface YamlParser {
    fun values(): LinkedHashMap<String, LinkedHashMap<String, String>>
}

class DefaultYamlParser(
    private val yaml: Yaml,
    private val locale: String,
    private val path: String,
    private val sectionKey: String
) : YamlParser {

    override fun values(): LinkedHashMap<String, LinkedHashMap<String, String>> {
        val yamlFile = readPath(path.toPath())

        val yamlValuesDefault = yaml.decodeMapFromString(yamlFile) as Map<*, *>
        val localeValuesDefault = yamlValuesDefault[locale] as Map<*, *>

        return localeValuesDefault[sectionKey] as LinkedHashMap<String, LinkedHashMap<String, String>>
    }
}