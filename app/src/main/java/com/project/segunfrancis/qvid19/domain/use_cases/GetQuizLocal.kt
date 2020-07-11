package com.project.segunfrancis.qvid19.domain.use_cases

import com.project.segunfrancis.qvid19.data.local.LocalRepository

/**
 * Created by SegunFrancis
 */

class GetQuizLocal(private val localRepository: LocalRepository) {
    operator fun invoke() = localRepository.getQuiz()
}