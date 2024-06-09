package com.example.mvvmproject.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ScrambleWordViewModel:ViewModel(){

    val _scrambledWord = MutableStateFlow("")

    val word = _scrambledWord.asStateFlow()

    val coroutine = {

    }

}