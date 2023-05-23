package com.lumec.liga.app.di

import com.lumec.liga.app.data.remote.LeagueApi
import com.lumec.liga.app.data.repository.TeamRepositoryImpl
import com.lumec.liga.app.domain.repository.TeamRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    @ApiUrl
    fun provideApiUrl(): String = "https://www.thesportsdb.com/api/v1/json/3/"

    @Provides
    @Singleton
    fun provideLeagueApi(@ApiUrl apiUrl: String): LeagueApi {
        val okHttpClient = HttpLoggingInterceptor().run {
            level = HttpLoggingInterceptor.Level.BODY
            OkHttpClient.Builder().addInterceptor(this).build()
        }

        return Retrofit.Builder()
            .baseUrl(apiUrl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(LeagueApi::class.java)
    }

    @Provides
    @Singleton
    fun provideTeamRepository(api: LeagueApi): TeamRepository {
        return TeamRepositoryImpl(api)
    }

}
