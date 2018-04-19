package me.kirkscope.cloud.pipe.sink.consumer

import me.kirkscope.cloud.pipe.IHttpConnectionProvider
import me.kirkscope.cloud.pipe.sink.IBuffer
import me.kirkscope.cloud.pipe.sink.ICallback
import mu.KLogging
import java.net.URI

class HttpsEventConsumer<in T>: IFallibleConsumer<T> {
    companion object: KLogging() {

    }

    override fun receive(events: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun close() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class Builder<T> {
        lateinit var remoteURI: URI
        lateinit var httpConnectionProvider: IHttpConnectionProvider
        lateinit var localStorageBuffer: IBuffer<T>
        lateinit var callback: ICallback<T>
        var wrapperFieldName = ""
        
    }
}