package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class EducatorPath(override val value: String) : Path {
    Name("educator.name"),
    Secondary("educator.secondary"),
    Type("educator.tertiary.type"),
    CourseSubject("educator.tertiary.course.subject"),
    CourseType("educator.tertiary.course.type")
}
