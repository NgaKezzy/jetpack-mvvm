package com.example.mvvm.features.home.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.compose.runtime.State

@HiltViewModel
class HomeViewModel  @Inject constructor() : ViewModel(){
    private val _counter = mutableStateOf(0)
    val counter: State<Int> = _counter


    fun increment(){
        _counter.value ++

    }
}