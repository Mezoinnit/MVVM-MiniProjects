package com.example.mvvmproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.mvvmproject.ui.theme.MvvmProjectTheme
import com.example.mvvmproject.view.Calculator.CalculatorScreen
import com.example.mvvmproject.view.ScrambleWord.ScrambleWordScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MvvmProjectTheme {
                CalculatorScreen()
            }
        }
    }
}