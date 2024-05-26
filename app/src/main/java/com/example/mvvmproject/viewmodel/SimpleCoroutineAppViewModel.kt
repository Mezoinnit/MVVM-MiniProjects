package com.example.mvvmproject.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutineViewModel : ViewModel() {
    val time = mutableIntStateOf(0)  //initialize timer value = 0

    fun coroutineTimer(value: Int) {
        time.intValue = value // update the value from the ui
        viewModelScope.launch(Dispatchers.Main) { countDown() } // runs the function into the main dispatcher to update it in the ui
    }


    private suspend fun countDown() { //countdown function logic
        for (i in time.intValue downTo 0) { //runs until i value in time value hits 0
            delay(1000)
            time.intValue = i
            Log.d("estimate Value: ", "${time.intValue}")
        }
    }
}

