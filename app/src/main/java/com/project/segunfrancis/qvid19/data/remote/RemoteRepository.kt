package com.project.segunfrancis.qvid19.data.remote

/**
 * Created by SegunFrancis
 */

class RemoteRepository(private val service: ApiService) {
    fun getQuiz() = service.getQuiz()
}