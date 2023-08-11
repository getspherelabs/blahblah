package io.spherelabs.blahblahfake.annotation


@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
public annotation class BlahBlahInternalApi(val message: String = "Only for internal usage.")
