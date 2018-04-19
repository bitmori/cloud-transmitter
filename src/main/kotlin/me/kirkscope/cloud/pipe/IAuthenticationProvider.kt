package me.kirkscope.cloud.pipe

interface IAuthenticationProvider {
    val type: AuthenticationType
    val key: String
    val extraInfo: Map<String, String>
}