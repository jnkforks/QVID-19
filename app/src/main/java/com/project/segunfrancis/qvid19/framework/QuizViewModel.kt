package com.project.segunfrancis.qvid19.framework

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.project.segunfrancis.qvid19.QuizApplication
import com.project.segunfrancis.qvid19.domain.entities.BaseResponse
import com.project.segunfrancis.qvid19.domain.entities.QuizData
import com.project.segunfrancis.qvid19.util.States
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by SegunFrancis
 */
class QuizViewModel(application: Application, protected val interactors: Interactors): AndroidViewModel(application) {
    protected val application: QuizApplication = getApplication()
    private val _quizList = MutableLiveData<States<BaseResponse?>>()
    val quizList: LiveData<States<BaseResponse?>>
        get() = _quizList

    init {
        loadQuizFromRemote()
    }

    private fun loadQuizFromLocal() {
        GlobalScope.launch {
            _quizList.postValue(States.Success(message = "Success", data = interactors.getQuizLocal().value))
        }
    }

    private fun insertQuizIntoLocal(quizData: BaseResponse?) {
        GlobalScope.launch {
            withContext(Dispatchers.IO) {
                interactors.insertQuiz(quizData)
            }
        }
        loadQuizFromLocal()
    }

    private fun loadQuizFromRemote() {
        _quizList.postValue(States.Loading("Loading"))
        interactors.getQuizRemote().enqueue(object : Callback<List<QuizData>?> {
            override fun onResponse(
                call: Call<List<QuizData>?>,
                response: Response<List<QuizData>?>
            ) {
                val baseResponse = BaseResponse(0, response.body())
                insertQuizIntoLocal(baseResponse)
            }

            override fun onFailure(call: Call<List<QuizData>?>, t: Throwable) {
                _quizList.postValue(States.Error("Something went wrong", t))
            }
        })
    }
}