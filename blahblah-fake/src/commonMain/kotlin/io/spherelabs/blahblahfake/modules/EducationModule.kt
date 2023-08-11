package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.EducatorPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class EducationModule(
    private val provider: Provider
) {
    public val course: CourseModule get() = CourseModule(provider)
    public val secondary: Secondary get() = Secondary(provider.get(EducatorPath.Secondary))
    public val name: Name get() = Name(provider.get(EducatorPath.Name))
    public val type: Type get() = Type(provider.get(EducatorPath.Type))
}

@JvmInline
public value class Secondary(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Type(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

public class CourseModule(
    private val provider: Provider
) {
    public val type: Type get() = Type(provider.get(EducatorPath.CourseType))
    public val subject: Subject get() = Subject(provider.get(EducatorPath.CourseSubject))
}

@JvmInline
public value class Subject(
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
