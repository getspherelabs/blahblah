package io.spherelabs.blahblahfake.path

enum class InternetPath(override val value: String) : Path {
    FreeEmail("internet.free_email"),
    SafeEmail("internet.safe_email"),
    DomainSuffix("internet.domain_suffix"),
    Avatar("internet.avatar"),
    ImageCategory("internet.image_category"),
    ImageDimension("internet.image_dimension"),
    Aol("internet.user_agent.aol"),
    Mozilla("internet.user_agent.firefox"),
    Opera("internet.user_agent.opera"),
    Safari("internet.user_agent.safari"),
    Chrome("internet.user_agent.chrome"),
    InternetExplorer("internet.user_agent.internet_explorer"),
    Netscape("internet.user_agent.netscape")
}