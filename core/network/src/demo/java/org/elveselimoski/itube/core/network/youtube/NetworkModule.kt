package org.elveselimoski.itube.core.network.youtube

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import org.elveselimoski.itube.core.network.youtube.YoutubeNetworkDataSource
import org.elveselimoski.itube.core.network.youtube.fake.FakeYoutubeNetworkDataSource
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface NetworkModule {

    @Binds
    fun bindYoutubeNetworkDataSource(youtubeNetwork: FakeYoutubeNetworkDataSource): YoutubeNetworkDataSource

    companion object {
        @Provides
        @Singleton
        fun providesNetworkJson(): Json = Json {
            ignoreUnknownKeys = true
        }
    }
}
