package com.example.mvvmproject.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FlowCounterViewModel: ViewModel() {
    private var _counter = MutableStateFlow(0) // private mutable state flow

    val counter = _counter.asStateFlow() // observes the _counter state flow

    fun increment(increment:Int) {
        _counter.update { increment + 1 } // increment the counter
    }
}

