package com.project.segunfrancis.qvid19.framework

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.project.segunfrancis.qvid19.QuizApplication

/**
 * Created by SegunFrancis
 */
class QuizViewModel(application: Application, protected val interactors: Interactors): AndroidViewModel(application) {
    protected val application: QuizApplication = getApplication()
}