package com.project.segunfrancis.qvid19.data_source.remote

import com.project.segunfrancis.qvid19.domain.entities.QuizData
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by SegunFrancis
 */
interface ApiService {
    @GET("questions")
    fun getQuiz(): Call<List<QuizData>>
}