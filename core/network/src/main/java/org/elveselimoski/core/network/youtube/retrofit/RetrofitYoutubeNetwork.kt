package org.elveselimoski.core.network.youtube.retrofit

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.elveselimoski.core.network.BuildConfig
import org.elveselimoski.core.network.youtube.YoutubeNetworkDataSource
import org.elveselimoski.core.network.youtube.model.YoutubeVideosResponse
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Inject
import javax.inject.Singleton

private const val YoutubeApiKey = BuildConfig.YOUTUBE_API_KEY
private const val YoutubeBaseUrl = BuildConfig.YOUTUBE_URL

private interface RetrofitYoutubeNetworkApi {
    @GET("videos?part=snippet,contentDetails,statistics&chart=mostPopular&regionCode=US&key={key}&pageToken={pageToken}")
    suspend fun getPopularVideos(
        @Path("pageToken") pageToken: String? = null,
        @Path("key") apiKey: String = YoutubeApiKey
    ): YoutubeVideosResponse
}

/**
 * [Retrofit] backed [YoutubeNetworkDataSource]
 */
@Singleton
class RetrofitYoutubeNetwork @Inject constructor(networkJson: Json) : YoutubeNetworkDataSource {

    private val networkApi = Retrofit.Builder()
        .baseUrl(YoutubeBaseUrl)
        .client(
            OkHttpClient.Builder()
                .addInterceptor(
                    // TODO: Decide logging logic
                    HttpLoggingInterceptor().apply {
                        setLevel(HttpLoggingInterceptor.Level.BODY)
                    }
                )
                .build()
        )
        .addConverterFactory(
            @OptIn(ExperimentalSerializationApi::class)
            networkJson.asConverterFactory("application/json".toMediaType())
        )
        .build()
        .create(RetrofitYoutubeNetworkApi::class.java)

    override suspend fun getPopularVideos(pageToken: String?): YoutubeVideosResponse =
        networkApi.getPopularVideos(pageToken)
}

