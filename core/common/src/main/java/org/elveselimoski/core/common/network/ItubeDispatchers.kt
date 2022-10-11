package org.elveselimoski.core.common.network

import javax.inject.Qualifier
import kotlin.annotation.AnnotationRetention.RUNTIME

@Qualifier
@Retention(RUNTIME)
annotation class Dispatcher(val itubeDispatcher: ItubeDispatchers)

enum class ItubeDispatchers {
    IO
}