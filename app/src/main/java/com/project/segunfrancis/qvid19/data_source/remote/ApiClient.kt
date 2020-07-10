package com.project.segunfrancis.qvid19.data_source.remote

import com.project.segunfrancis.qvid19.util.AppConstants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Created by SegunFrancis
 */
object ApiClient {
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
}