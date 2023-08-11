package io.spherelabs.blahblahfake.provider

import io.spherelabs.blahblahfake.path.Path

public interface Provider {
    public  fun get(path: Path): String
}
