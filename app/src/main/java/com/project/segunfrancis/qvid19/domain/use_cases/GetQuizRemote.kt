package com.project.segunfrancis.qvid19.domain.use_cases

import com.project.segunfrancis.qvid19.data.remote.RemoteRepository

/**
 * Created by SegunFrancis
 */

class GetQuizRemote(private val remoteRepository: RemoteRepository) {
    operator fun invoke() = remoteRepository.getQuiz()
}