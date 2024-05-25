package com.example.mvvmproject.view.KotlinFlows

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmproject.viewmodel.FlowDataSimulatorViewModel

@Composable
fun DataSimulatorScreen() {
    // gets the data from the viewmodel to be able to update .. not necessary to call this function as they already called in the function parameters
    val dataViewModel = viewModel<FlowDataSimulatorViewModel>()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        DataView(dataViewModel)
        DataFunction()
    }
}

@Composable
fun DataView(vm: FlowDataSimulatorViewModel) {
    val listState = vm.dataList.collectAsState() //gets the list values from the dataList

    LazyColumn(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth(),
    ) {
        items(listState.value) {//
            Text(text = it.name, style = MaterialTheme.typography.bodyMedium)
            Log.d("List Item Name: ", "$it")
        }
    }

}

@Composable
fun DataFunction(vm: FlowDataSimulatorViewModel = viewModel()) {
    val textState = vm.dataName.collectAsState() //get the text value from the TextField

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextField(value = textState.value, onValueChange = {
            vm.dataUpdater(it)
        }, singleLine = true, keyboardActions = KeyboardActions(onDone = {
            vm.listName(textState.value)
        }))
        Log.d("List TextState Value: ", textState.value)
        Button(onClick = {
            vm.listName(textState.value) //add the text value to the list
        }) {
            Text(text = "Add!")
        }
    }
}