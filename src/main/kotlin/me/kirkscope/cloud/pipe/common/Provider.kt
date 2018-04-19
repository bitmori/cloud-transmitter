package me.kirkscope.cloud.pipe.common

import mu.KLogging

enum class Provider {
    AUTHENTICATION_PROVIDER,
    HTTP_CONNECTION_PROVIDER,
    INSTANCE_ID_PROVIDER,
    PROXY_PROVIDER,
    SINK_FINK_PROVIDER;

    companion object : KLogging() {
        fun <T> of(type: Class<T>, providerClassName: String?): T? {
            if (providerClassName != null && providerClassName.trim { it <= ' ' }.isNotEmpty()) {
                try {
                    val clazz = Class.forName(providerClassName.trim { it <= ' ' })
                    if (type.isAssignableFrom(clazz)) {
                        return clazz.newInstance() as T
                    } else {
                        logger.error { "Cannot create an instance of ${type.simpleName} from provided class name: $providerClassName" }
                    }
                } catch (e: ClassNotFoundException) {
                    logger.error(e) { "Cannot create an instance of ${type.simpleName} from provided class name: $providerClassName" }
                } catch (e: InstantiationException) {
                    logger.error(e) { "Cannot create an instance of ${type.simpleName} from provided class name: $providerClassName" }
                } catch (e: IllegalAccessException) {
                    logger.error(e) { "Cannot create an instance of ${type.simpleName} from provided class name: $providerClassName" }
                }

            }
            return null
        }
    }
}