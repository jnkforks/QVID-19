package com.project.segunfrancis.qvid19.domain.entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

/**
 * Created by SegunFrancis
 */

@Parcelize
@Entity(tableName = "quiz_table")
data class BaseResponse(
    @PrimaryKey val id: Long = 0,
    val questions: List<QuizData>?
) : Parcelable