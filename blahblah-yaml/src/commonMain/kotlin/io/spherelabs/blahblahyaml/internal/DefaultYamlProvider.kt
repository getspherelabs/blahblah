package io.spherelabs.blahblahyaml.internal

import io.spherelabs.blahblahyaml.config.YamlParam
import io.spherelabs.blahblahyaml.exception.ResourceNotFoundException
import io.spherelabs.blahblahyaml.parser.YamlParser
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.random.Random

/**
 * Default implementation of the YamlProvider interface.
 *
 * @param yamlParser The YamlParser instance used for fetching YAML resources.
 * @param random The random number generator (optional, uses default if not provided).
 */
internal class DefaultYamlProvider(
    private val yamlParser: YamlParser,
    private val random: Random = Random.Default
) : YamlProvider {

    private val numeralAndBracesRegEx = "#\\{(.*?)\\}"
    private val numeralRegEx = ".*#(\\{[^a-zA-z]|[^{])+"
    private val numeralOnlyRegEx = "#"

    override fun get(key: String): String {
        val separator = key.lastIndexOf(".")
        val category = key.substring(0, separator)
        val selected = key.substring(separator + 1, key.length)
        val selectedValue = fetchSelectedValue(key, category, selected)

        return when {
            selectedValue.matches(Regex(numeralAndBracesRegEx)) -> fetchKeyValueData(
                category,
                selectedValue
            )
            selectedValue.matches(Regex(numeralRegEx)) -> fetchNumerals(selectedValue)
            else -> selectedValue
        }
    }

    private fun fetchSelectedValue(key: String, category: String, selected: String): String {
        var categoryValues = fetchCategory(key, category, true, yamlParser.values())
        if (categoryValues[selected] == null) {
            if (yamlParser.values().size == 0) {
                throw Exception(getResourceNotFound(key))
            }
            categoryValues = fetchCategory(key, category, false, yamlParser.values())
            if (categoryValues[selected] == null) {
                throw Exception(getResourceNotFound(key))
            }
        }
        when {
            categoryValues[selected] is ArrayList<*> -> {
                val values = categoryValues[selected] as ArrayList<ArrayList<String>>
                if (values[0] is CharSequence) {
                    return getRandomString(values as ArrayList<String>)
                }
                return getRandomString(values[random.nextInt(values.size)])
            }
            categoryValues[selected] is String -> return categoryValues[selected] as String
            else -> throw ResourceNotFoundException("Resource $category.$selected is not a value")
        }
    }

    private fun fetchKeyValueData(category: String, selectedValue: String): String {
        return matchAndReplace(selectedValue, numeralAndBracesRegEx) {
            fetchValueByCategory(category, it.groupValues.last())
        }
    }

    private fun fetchValueByCategory(category: String, key: String): String {
        val separator = key.lastIndexOf(".")
        var dataCategory = category
        var keyToFetch = key
        var result: String

        if (separator != -1) {
            dataCategory = key.substring(0, separator).lowercase()
            keyToFetch = key.substring(separator + 1, key.length)
            result = fetchSelectedValue(key, dataCategory, keyToFetch)
        } else {
            val yamValues = yamlParser.values()
            val categoryValues =
                yamValues[dataCategory] as? LinkedHashMap<String, ArrayList<String>>
                    ?: yamValues[dataCategory] as LinkedHashMap<String, ArrayList<String>>
            val selectedValues = categoryValues[keyToFetch] as ArrayList<String>
            result = getRandomString(selectedValues)
        }

        if (result.matches(Regex(numeralRegEx))) {
            result = fetchNumerals(result)
        }
        if (result.matches(Regex(numeralAndBracesRegEx))) {
            result = fetchKeyValueData(dataCategory, result)
        }
        return result
    }

    private fun fetchNumerals(numeral: String): String {
        return matchAndReplace(
            numeral,
            numeralOnlyRegEx
        ) { random.nextInt(10).toString() }
    }

    private fun getRandomString(selectedValues: ArrayList<String>): String =
        selectedValues[random.nextInt(selectedValues.size)]

    private fun matchAndReplace(
        stringToMatch: String,
        regExp: String,
        transform: (MatchResult) -> CharSequence
    ): String {
        val matcher = Regex(regExp)
        return matcher.replace(stringToMatch, transform)
    }

    private fun fetchCategory(
        key: String,
        category: String,
        check: Boolean,
        valuesToFetch: LinkedHashMap<String, LinkedHashMap<String, String>>
    ): LinkedHashMap<*, *> {
        val (_, subCategory, _, values) = getCategoryAndValues(
            key,
            YamlParam(category.indexOf("."), category, check, valuesToFetch)
        )
        return when {
            values[subCategory] is LinkedHashMap<*, *> -> values[subCategory] as LinkedHashMap<*, *>
            values[subCategory] is ArrayList<*> -> {
                val valuesList = values[subCategory] as ArrayList<LinkedHashMap<*, *>>
                valuesList[random.nextInt(valuesList.size)]
            }
            else -> throw ResourceNotFoundException("Resource Key not found $category on $key")
        }
    }

    private fun getCategoryAndValues(key: String, baseParams: YamlParam): YamlParam {
        val params =
            YamlParam(
                baseParams.separator,
                baseParams.category,
                baseParams.check,
                baseParams.values
            )

        if (params.separator == -1 && params.values[params.category] == null) {
            checkAndSetParams(key, baseParams, params)
        }

        while (params.separator != -1) {
            if (params.check && params.values[
                    params.category.substring(
                        0,
                        params.separator
                    )
                ] == null
            ) {
                checkAndSetParams(key, baseParams, params)
            }
            params.values = params.values[
                params.category.substring(
                    0,
                    params.separator
                )
            ] as LinkedHashMap<String, LinkedHashMap<String, String>>
            params.category =
                params.category.substring(params.separator + 1, params.category.length)
            params.separator = params.category.indexOf(".")
            if (params.separator == -1 && params.values[params.category] == null) {
                checkAndSetParams(key, baseParams, params)
            }
        }
        return params
    }

    private fun checkAndSetParams(key: String, baseParams: YamlParam, params: YamlParam) {
        if (!params.check || this.yamlParser.values().size == 0) {
            throw ResourceNotFoundException(getResourceNotFound(key))
        }
        params.separator = baseParams.category.indexOf(".")
        params.category = baseParams.category
        params.values = this.yamlParser.values()
        params.check = false
    }

    private fun getResourceNotFound(key: String): String = "Resource not found $key"
}
