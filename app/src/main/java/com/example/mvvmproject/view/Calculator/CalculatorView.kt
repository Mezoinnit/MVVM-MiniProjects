package com.example.mvvmproject.view.Calculator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvvmproject.ui.theme.MvvmProjectTheme

@Composable
fun CalculatorScreen(){
    Scaffold(topBar = { TopAppBar() }, bottomBar = {  } ) {PaddingValues ->

        CalculatorLayout()

    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorScreenPreview(){
    MvvmProjectTheme {
        CalculatorScreen()
    }
}