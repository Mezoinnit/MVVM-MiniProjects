package com.example.mvvmproject.viewmodel

import androidx.lifecycle.ViewModel

class ViewModelPractice: ViewModel() {
    var count = 0

    fun incCount() {
        count += 1
    }

}
