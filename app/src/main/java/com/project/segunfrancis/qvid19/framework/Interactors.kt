package com.project.segunfrancis.qvid19.framework

import com.project.segunfrancis.qvid19.domain.use_cases.GetQuizLocal
import com.project.segunfrancis.qvid19.domain.use_cases.GetQuizRemote
import com.project.segunfrancis.qvid19.domain.use_cases.InsertQuiz

/**
 * Created by SegunFrancis
 */
data class Interactors(
    val insertQuiz: InsertQuiz,
    val getQuizRemote: GetQuizRemote,
    val getQuizLocal: GetQuizLocal
)