package com.example.mvvmproject.view.KotlinFlows

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmproject.viewmodel.FlowCounterViewModel

@Composable
fun FlowCounterScreen(vm: FlowCounterViewModel = viewModel()) {

    val counter = vm.counter.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Counter is ${counter.value}") // shows the counter value
        Spacer(modifier = Modifier.height(64.dp))
        Button(onClick = { vm.increment(counter.value) }) {
            Text(text = "Increment") // increases the value by 1
        }
    }

}