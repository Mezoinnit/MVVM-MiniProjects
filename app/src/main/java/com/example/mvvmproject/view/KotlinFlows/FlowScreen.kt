package com.example.mvvmproject.view.KotlinFlows

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmproject.viewmodel.FlowViewModel

@Composable
fun FlowScreen(vm: FlowViewModel = viewModel()){
    val textState = vm.flow.collectAsState()
    Column(
        modifier = Modifier.fillMaxSize().padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = textState.value)
        Spacer(modifier = Modifier.height(32.dp))
        TextField(value = textState.value, onValueChange = {
            vm.flowUpdater(it)
        }, singleLine = true, modifier = Modifier.fillMaxWidth(0.85f))
    }
}