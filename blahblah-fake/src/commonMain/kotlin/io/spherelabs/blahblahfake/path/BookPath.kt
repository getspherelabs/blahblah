package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class BookPath (override val value: String): Path {
    Title("book.title"),
    Author("book.author"),
    Publisher("book.publisher"),
    Genre("book.genre")
}
