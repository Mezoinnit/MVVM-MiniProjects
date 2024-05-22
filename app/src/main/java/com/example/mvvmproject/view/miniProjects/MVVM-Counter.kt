package com.example.mvvmproject.view.miniProjects

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmproject.viewmodel.ViewModelPractice


/*OnCreate() --Values
    val vm: ViewModelPractice by viewModels()
    MainScreen(vm)
*/


@Composable
fun MainScreen(vm: ViewModelPractice = viewModel()) {
    var num by remember{
        mutableStateOf(vm.count)

    }
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "${num}")
        Button(onClick = { vm.incCount()
            num = vm.count
        }) {
            Text(text = "Add!")
        }
    }
}