package com.example.mvvmproject.viewmodel

import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmproject.model.QuoteData
import com.example.mvvmproject.model.quoteList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class QuoteViewModel : ViewModel() {

    private val quoteData = MutableStateFlow(listOf<QuoteData>())

    val quoteValue = quoteData.asStateFlow()

    private var num = mutableIntStateOf(0)

    fun loadQuote() {
        viewModelScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.Main){
                quoteData.value = listOf( quoteList()[num.intValue] )
                quoteLogic()
            }
        }

    }

    private suspend fun quoteLogic() {
        val rnd = (0..7).random()
        delay(1000)
        num.intValue = rnd
    }
}
