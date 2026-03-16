package com.example.mvvm.features.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf

@HiltViewModel
class HomeViewModel  @Inject constructor() : ViewModel(){
    private val _counter = mutableIntStateOf(0)
    val counter: State<Int> = _counter

    private  val _name = mutableStateOf("")
    val  name : State<String> = _name


    fun increment(){
        _counter.value ++
    }

    fun  changedName(){
        _name.value = "Ngà kezzy"
    }
}