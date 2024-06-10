package com.example.mvvmproject.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmproject.model.allWords
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ScrambleWordViewModel : ViewModel() {

    private val _scrambledWord = MutableStateFlow("")

    val word = _scrambledWord.asStateFlow()

    fun scrambleLogic() {
        viewModelScope.launch(Dispatchers.IO) {
            val word = getScrambleWord()
            withContext(Dispatchers.Main){
                _scrambledWord.value = word
            }

        }
    }

    private suspend fun getScrambleWord(): String {
        return allWords.random()
    }
}