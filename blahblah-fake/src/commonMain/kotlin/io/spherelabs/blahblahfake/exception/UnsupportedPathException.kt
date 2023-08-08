package io.spherelabs.blahblahfake.exception

import io.spherelabs.blahblahfake.path.Path

class UnsupportedPathException(path: Path) : Exception("Unsupported path type: $path")