package com.project.segunfrancis.qvid19.domain.entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "quiz_table")
data class QuizData(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @field:Json(name = "answers")
    val answers: List<Answer>,
    @field:Json(name = "question")
    val question: String
) : Parcelable