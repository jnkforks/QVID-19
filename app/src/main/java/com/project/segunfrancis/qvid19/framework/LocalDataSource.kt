package com.project.segunfrancis.qvid19.framework

import android.content.Context
import androidx.lifecycle.LiveData
import com.project.segunfrancis.qvid19.data.local.QuizDao
import com.project.segunfrancis.qvid19.data.local.QuizDatabase
import com.project.segunfrancis.qvid19.domain.entities.QuizData

/**
 * Created by SegunFrancis
 */
class LocalDataSource(context: Context) : QuizDao {
    private val quizDao = QuizDatabase.getDatabase(context).quizDao()

    override suspend fun insertQuiz(quizData: List<QuizData>?) {
        quizDao.insertQuiz(quizData)
    }

    override fun getQuiz(): LiveData<List<QuizData>> {
        return quizDao.getQuiz()
    }
}