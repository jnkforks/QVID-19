package com.project.segunfrancis.qvid19.domain.use_cases

import com.project.segunfrancis.qvid19.data.local.LocalRepository
import com.project.segunfrancis.qvid19.domain.entities.QuizData

/**
 * Created by SegunFrancis
 */

class InsertQuiz(private val localRepository: LocalRepository) {
    suspend operator fun invoke(quizData: List<QuizData>?) = localRepository.insertQuiz(quizData)
}