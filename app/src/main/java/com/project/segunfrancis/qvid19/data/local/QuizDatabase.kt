package com.project.segunfrancis.qvid19.data.local

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Created by SegunFrancis
 */

abstract class QuizDatabase : RoomDatabase() {
    abstract fun quizDao(): QuizDao

    companion object {
        @Volatile
        private var INSTANCE: QuizDatabase? = null

        fun getDatabase(context: Context): QuizDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    QuizDatabase::class.java, "quiz_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}