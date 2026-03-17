package com.example.mvvm.features.home

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import com.example.mvvm.data.repository.MainLogImpl
import com.example.mvvm.domain.repository.MainLog
import kotlin.math.log

@HiltViewModel
class HomeViewModel  @Inject constructor(
  private  val log: MainLogImpl
) : ViewModel(){
    private val _counter = mutableIntStateOf(0)
    val counter: State<Int> = _counter

    private  val _name = mutableStateOf("")
    val  name : State<String> = _name


    fun increment(){
        _counter.value ++
        log.e("HomeViewModel", "Counter: ${_counter.value}")
    }

    fun  changedName(){
        _name.value = "Ngà kezzy"
    }
}