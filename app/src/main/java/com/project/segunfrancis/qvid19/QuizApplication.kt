package com.project.segunfrancis.qvid19

import android.app.Application
import com.project.segunfrancis.qvid19.data.local.LocalRepository
import com.project.segunfrancis.qvid19.data.remote.RemoteRepository
import com.project.segunfrancis.qvid19.framework.LocalDataSource
import com.project.segunfrancis.qvid19.framework.RemoteDataSource

/**
 * Created by SegunFrancis
 */
class QuizApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val localRepository = LocalRepository(LocalDataSource(this))
        val remoteRepository = RemoteRepository(RemoteDataSource())
    }
}