package io.spherelabs.blahblahfake.path

internal enum class EducatorPath(override val value: String) : Path {
    Name("educator.name"),
    Secondary("educator.secondary"),
    Type("educator.tertiary.type"),
    CourseSubject("educator.tertiary.course.subject"),
    CourseType("educator.tertiary.course.type")
}
