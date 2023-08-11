package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class CompanyPath(override val value: String) : Path {
    Buzzwords("company.buzzwords"),
    Name("company.name"),
    Bs("company.bs"),
    Industry("company.industry"),
    Profession("company.profession")
}
