package com.project.segunfrancis.qvid19.data.local

import com.project.segunfrancis.qvid19.domain.entities.BaseResponse

/**
 * Created by SegunFrancis
 */

class LocalRepository(private val dao: QuizDao) {
    suspend fun insertQuiz(quizData: BaseResponse?) = dao.insertQuiz(quizData)

    fun getQuiz() = dao.getQuiz()
}