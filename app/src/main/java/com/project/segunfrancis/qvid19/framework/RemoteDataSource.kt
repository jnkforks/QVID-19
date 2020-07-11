package com.project.segunfrancis.qvid19.framework

import com.project.segunfrancis.qvid19.data.remote.ApiClient
import com.project.segunfrancis.qvid19.data.remote.ApiService
import com.project.segunfrancis.qvid19.domain.entities.QuizData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

/**
 * Created by SegunFrancis
 */
class RemoteDataSource : ApiService {

    private val client = ApiClient.getClient()?.create(ApiService::class.java)

    override fun getQuiz(): Call<List<QuizData>> {
        return client!!.getQuiz()
    }
}