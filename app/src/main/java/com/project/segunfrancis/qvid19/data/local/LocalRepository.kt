package com.project.segunfrancis.qvid19.data.local

import com.project.segunfrancis.qvid19.domain.entities.QuizData

/**
 * Created by SegunFrancis
 */

class LocalRepository(private val dao: QuizDao) {
    suspend fun insertQuiz(quizData: List<QuizData>?) = dao.insertQuiz(quizData)

    fun getQuiz() = dao.getQuiz()
}