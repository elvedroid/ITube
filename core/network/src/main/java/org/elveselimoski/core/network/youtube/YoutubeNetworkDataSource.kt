package org.elveselimoski.core.network.youtube

import org.elveselimoski.core.network.youtube.model.YoutubeVideosResponse

interface YoutubeNetworkDataSource {

    suspend fun getPopularVideos(pageToken: String? = null): YoutubeVideosResponse
}
