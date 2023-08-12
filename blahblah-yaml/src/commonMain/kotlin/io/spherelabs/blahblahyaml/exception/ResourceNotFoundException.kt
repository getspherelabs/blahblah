package io.spherelabs.blahblahyaml.exception

/**
 * [ResourceNotFoundException] indicates that a requested resource could not be found.
 *
 * @param message A detailed error message explaining the reason for the exception.
 */
internal class ResourceNotFoundException(message: String) : Exception(message)
