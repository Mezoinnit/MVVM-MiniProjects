package com.example.mvvmproject.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.mvvmproject.model.DataSimulator
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FlowDataSimulatorViewModel : ViewModel() {
    private val _dataName = MutableStateFlow(listOf<DataSimulator>())
    private val name = MutableStateFlow("") //state holder

    val dataName = name.asStateFlow() // observe the state changes
    val dataList = _dataName.asStateFlow()

    fun listName(listName:String) {
        val currentList = _dataName.value.toMutableList() // Create a mutable copy of the list
        currentList.add(DataSimulator(listName)) // Add the new value to the list
        _dataName.value = currentList // Update the _dataName variable with the new list
        Log.d("Item Updates: ", "Item Added")
    }

    fun dataUpdater(n: String) = name.update { n }

}