package com.project.segunfrancis.qvid19.util

import java.lang.Exception

/**
 * Created by SegunFrancis
 */
sealed class States {
    data class Success<T>(var message: String, var data: T): States()
    data class Error(var message: String, var exception: Exception): States()
    data class Loading(var message: String): States()
}