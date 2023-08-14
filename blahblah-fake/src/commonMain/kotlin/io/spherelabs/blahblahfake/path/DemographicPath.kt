package io.spherelabs.blahblahfake.path

public enum class DemographicPath(override val value: String) : Path {
    Race("demographic.race"),
    Sex("demographic.sex"),
    Demonym("demographic.demonym"),
    EducationalAttainment("demographic.educational_attainment"),
    MaritalStatus("demographic.marital_status")
}
