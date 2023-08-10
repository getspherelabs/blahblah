package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.EducatorPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

class EducationModule(
    private val provider: Provider
) {
    val course: CourseModule get() = CourseModule(provider)
    val secondary: Secondary get() = Secondary(provider.get(EducatorPath.Secondary))
    val name: Name get() = Name(provider.get(EducatorPath.Name))
    val type: Type get() = Type(provider.get(EducatorPath.Type))
}

@JvmInline
value class Secondary(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Type(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

class CourseModule(
    private val provider: Provider
) {
    val type: Type get() = Type(provider.get(EducatorPath.CourseType))
    val subject: Subject get() = Subject(provider.get(EducatorPath.CourseSubject))
}

@JvmInline
value class Subject(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun educationModule(yamlProvider: () -> YamlProvider): EducationModule {
    return EducationModule(provider = provider {
        type(ProviderType.Educator)
        yamlProvider(yamlProvider())
    })
}