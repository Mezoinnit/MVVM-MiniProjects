package com.example.mvvmproject.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmproject.model.allWords
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ScrambleWordViewModel : ViewModel() {

    private val _scrambledWord = MutableStateFlow("")

    val word = _scrambledWord.asStateFlow()

    val gWord = mutableStateOf("")

    fun scrambleLogic() {
        viewModelScope.launch(Dispatchers.IO) {
            val wordToScramble = getScrambleWord()
            gWord.value = wordToScramble
            val shuffledWord = wordToScramble.toCharArray().apply { shuffle() }.concatToString()

            withContext(Dispatchers.Main) {
                _scrambledWord.value = shuffledWord
            }
        }
    }

    private suspend fun getScrambleWord(): String {
        delay(100)
        return allWords.random()
    }
}