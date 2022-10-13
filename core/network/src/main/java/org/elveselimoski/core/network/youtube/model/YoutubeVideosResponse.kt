package org.elveselimoski.core.network.youtube.model

import kotlinx.serialization.Serializable

@Serializable
data class YoutubeVideosResponse(
    val etag: String,
    val items: List<YoutubeVideoResource>,
    val nextPageToken: String,
    val pageInfo: PageInfo
) {
    @Serializable
    data class PageInfo(
        val totalResults: Int,
        val resultsPerPage: Int
    )
}
