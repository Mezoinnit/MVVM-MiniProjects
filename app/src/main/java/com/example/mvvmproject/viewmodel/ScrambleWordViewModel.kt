package com.example.mvvmproject.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmproject.model.allWords
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ScrambleWordViewModel : ViewModel() {

    private val _scrambledWord = MutableStateFlow("")

    val word = _scrambledWord.asStateFlow()

    fun ScrambleLogic() {
        viewModelScope.launch {

        }
    }

    suspend fun getscrambleWord(): String {
        return allWords.random()
    }
}