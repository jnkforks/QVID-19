package com.project.segunfrancis.qvid19.data.remote

import com.project.segunfrancis.qvid19.BuildConfig
import com.project.segunfrancis.qvid19.util.AppConstants.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Created by SegunFrancis
 */
object ApiClient {
    fun getClient(): Retrofit? {
        var retrofit: Retrofit? = null
        val httpClient = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            httpClient.addInterceptor(logging)
        }
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .client(httpClient.build())
                .build()
        }
        return retrofit
    }
}