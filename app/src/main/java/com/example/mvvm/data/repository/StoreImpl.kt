package com.example.mvvm.data.repository

import android.content.SharedPreferences
import com.example.mvvm.domain.repository.Store
import dagger.hilt.android.internal.Contexts
import dagger.hilt.android.qualifiers.ApplicationContext
import jakarta.inject.Inject

class StoreImpl @Inject constructor(
    @ApplicationContext contexts: Contexts,
    private  val sharedPreferences: SharedPreferences
) : Store {
    override fun getValue(key: String): String {
        TODO("Not yet implemented")
    }

    override fun setValue(key: String, value: String) {
        TODO("Not yet implemented")
    }
}