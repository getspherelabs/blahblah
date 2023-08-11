package io.spherelabs.blahblahfake.path

internal enum class JobPath(override val value: String) : Path {
    Field("job.title"),
    Position("job.position"),
    Skill("job.skills"),
    Title("job.title")
}
