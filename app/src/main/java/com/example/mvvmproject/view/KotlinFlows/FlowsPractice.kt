package com.example.mvvmproject.view.KotlinFlows

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

// Kotlin Flows
fun MainFlow() {
    runBlocking {
        Flow().collect {
                Log.d("FlowBlock", it)
            }
    }
}

fun Flow(): Flow<String> = flow {
    emit("Mezo")
    delay(1000)
}