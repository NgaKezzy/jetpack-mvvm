package com.example.mvvm.data.repository

import android.util.Log
import com.example.mvvm.domain.repository.MainLog
import jakarta.inject.Inject

class MainLogImpl @Inject constructor() : MainLog {
    override fun d(tag: String, msg: String) {
        Log.d(tag,msg)
    }

    override fun i(tag: String, msg: String) {
          Log.i(tag,msg)
    }

    override fun e(tag: String, msg: String) {
          Log.e(tag,msg)
    }
}