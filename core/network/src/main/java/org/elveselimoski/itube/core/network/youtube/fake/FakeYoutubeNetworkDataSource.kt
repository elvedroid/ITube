package org.elveselimoski.itube.core.network.youtube.fake

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.elveselimoski.itube.core.common.network.Dispatcher
import org.elveselimoski.itube.core.common.network.ItubeDispatchers.IO
import org.elveselimoski.itube.core.network.youtube.YoutubeNetworkDataSource
import org.elveselimoski.itube.core.network.youtube.model.YoutubeVideosResponse
import javax.inject.Inject

/**
 * [YoutubeNetworkDataSource] implementation that provides static video resources to aid development
 */
class FakeYoutubeNetworkDataSource @Inject constructor(
    @Dispatcher(IO) private val ioDispatcher: CoroutineDispatcher,
    private val networkJson: Json
) : YoutubeNetworkDataSource {
    override suspend fun getPopularVideos(pageToken: String?): YoutubeVideosResponse =
        withContext(ioDispatcher) {
            networkJson.decodeFromString(FakeYoutubeDataSource.youtubeVideosResponse)
        }
}
