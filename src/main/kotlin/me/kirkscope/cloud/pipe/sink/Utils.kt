package me.kirkscope.cloud.pipe.sink

interface IBuffer<T> {
    fun put(event: T)
    fun put(events: Collection<T>)
    fun isEmpty(): Boolean
    fun isNotEmpty() = !isEmpty()
    fun detach(size: Int, sizer: ISizer<T>): Collection<T>
}

interface ISizer<in T> {
    fun size(sizeable: T): Int
}

interface ICallback<in T> {
    fun success(payloads: Collection<T>)
    fun failure(payloads: Collection<T>, reason: String)
}