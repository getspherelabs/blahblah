package io.spherelabs.blahblahfake.path

internal enum class BookPath (override val value: String): Path {
    Title("book.title"),
    Author("book.author"),
    Publisher("book.publisher"),
    Genre("book.genre")
}
