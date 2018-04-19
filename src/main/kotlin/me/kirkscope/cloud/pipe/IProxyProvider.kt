package me.kirkscope.cloud.pipe

interface IProxyProvider {
    val proxyProtocol: String
    val proxyHost: String
    val proxyPort: Int
    val proxyUsername: String
    val proxyPassword: String
}