package com.project.segunfrancis.qvid19.util

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.project.segunfrancis.qvid19.domain.entities.Answer
import com.project.segunfrancis.qvid19.domain.entities.QuizData

/**
 * Created by SegunFrancis
 */

class QuizTypeConverters {

    @TypeConverter
    fun quizDataToString(items: List<QuizData>): String? {
        return Gson().toJson(items)
    }

    @TypeConverter
    fun stringToQuizData(value: String?): List<QuizData>? {
        val type = object : TypeToken<List<QuizData>>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun answersToString(items: List<Answer>): String? {
        return Gson().toJson(items)
    }

    @TypeConverter
    fun stringToAnswers(value: String?): List<Answer>? {
        val type = object : TypeToken<List<Answer>>() {}.type
        return Gson().fromJson(value, type)
    }
}