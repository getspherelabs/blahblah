package io.spherelabs.blahblahfake.internal

/**
 * [blah] is a builder function that creates an instance of [BlahBlah] with customizable configuration options.
 *
 * @param newLocale The new locale to use (default is "en").
 * @param resourcePath A function providing the resource path (default is a test resource path).
 * @return An instance of [BlahBlah] configured with the specified options.
 */
public fun blah(
    newLocale: String = "en",
    resourcePath: () -> String = { "src/commonTest/resources/en.yml" }
): BlahBlah {
    return DefaultBlahBlah(
        configuration = configs {
            locale = newLocale
            path = resourcePath.invoke()
        }
    )
}
