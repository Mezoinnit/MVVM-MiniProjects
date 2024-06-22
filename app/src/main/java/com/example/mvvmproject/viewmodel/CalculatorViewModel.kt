package com.example.mvvmproject.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CalculatorViewModel: ViewModel() {
    private val calcValue = MutableStateFlow("32.5 + 5")

    val calculator = calcValue.asStateFlow()



    fun calculate(){

    }
}