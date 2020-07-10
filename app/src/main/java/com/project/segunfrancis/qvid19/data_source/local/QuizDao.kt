package com.project.segunfrancis.qvid19.data_source.local

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.project.segunfrancis.qvid19.domain.entities.QuizData

/**
 * Created by SegunFrancis
 */
interface QuizDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuiz(quizData: List<QuizData>?)

    @Query("SELECT * FROM quiz_table")
    fun getQuiz(): LiveData<List<QuizData>>
}