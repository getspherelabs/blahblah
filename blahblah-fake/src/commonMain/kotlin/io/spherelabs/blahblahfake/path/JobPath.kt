package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class JobPath(override val value: String) : Path {
    Field("job.title"),
    Position("job.position"),
    Skill("job.skills"),
    Title("job.title")
}
