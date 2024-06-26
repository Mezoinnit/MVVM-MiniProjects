package com.example.mvvmproject.view.KotlinCoroutines

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmproject.viewmodel.CoroutineViewModel


@Composable
fun CoroutineTimer(vm: CoroutineViewModel = viewModel()) {
    var countdownValue by remember { mutableIntStateOf(0) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = vm.time.intValue.toString()) // timer value
        TextField(
            value = countdownValue.toString(),
            onValueChange = { countdownValue = it.toIntOrNull() ?: 0 },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            keyboardActions = KeyboardActions(onDone = {
                vm.coroutineTimer(countdownValue) // calls the coroutine logic
            }),
            singleLine = true
        )
    }
}