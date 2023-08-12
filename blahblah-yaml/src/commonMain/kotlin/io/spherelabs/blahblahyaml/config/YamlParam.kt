package io.spherelabs.blahblahyaml.config

/**
 * [YamlParam] represents parameters used in YAML-related operations.
 *
 * @property separator The index of the last separator in the category.
 * @property category The category associated with the operation.
 * @property check Indicates whether to perform a resource check.
 * @property values The values associated with the YAML resource.
 */
internal data class YamlParam(
    var separator: Int,
    var category: String,
    var check: Boolean,
    var values: YamlResource
)
