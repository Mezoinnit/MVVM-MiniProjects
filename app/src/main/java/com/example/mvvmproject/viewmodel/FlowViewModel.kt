package com.example.mvvmproject.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FlowViewModel: ViewModel() {
    private val _flow = MutableStateFlow("")

    val flow = _flow.asStateFlow()

    fun flowUpdater(flow: String){
        _flow.update { flow }
    }
}

