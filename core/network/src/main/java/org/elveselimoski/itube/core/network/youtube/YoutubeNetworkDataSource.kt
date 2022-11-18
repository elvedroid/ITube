package org.elveselimoski.itube.core.network.youtube

import org.elveselimoski.itube.core.network.youtube.model.YoutubeVideosResponse

interface YoutubeNetworkDataSource {

    suspend fun getPopularVideos(pageToken: String? = null): YoutubeVideosResponse
}
