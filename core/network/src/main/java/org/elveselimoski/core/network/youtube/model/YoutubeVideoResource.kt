package org.elveselimoski.core.network.youtube.model

import kotlinx.serialization.Serializable
import org.elveselimoski.core.model.VideoResource

/**
 * Network representation of [VideoResource]
 */
@Serializable
data class YoutubeVideoResource(
    val id: String,
    val snippet: Snippet,
    val contentDetails: ContentDetails,
    val statistics: Statistics,
) {

    @Serializable
    data class Snippet(
        val title: String,
        val description: String,
        val publishedAt: String,
        val channelTitle: String,
        val thumbnails: Thumbnails
    ) {
        @Serializable
        data class Thumbnails(
            val default: Thumbnail,
            val medium: Thumbnail,
            val high: Thumbnail,
            val maxres: Thumbnail,
            val standard: Thumbnail
        )
    }

    @Serializable
    data class ContentDetails(
        val duration: String,
        val definition: String
    )

    @Serializable
    data class Statistics(
        val viewCount: Long,
        val favoriteCount: Int,
        val likeCount: Long? = 0,
        val commentCount: Long? = 0
    )

    @Serializable
    data class Thumbnail(
        val url: String,
        val width: Int,
        val height: Int
    )
}
