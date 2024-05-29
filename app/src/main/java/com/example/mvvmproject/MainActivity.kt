package com.example.mvvmproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvvmproject.ui.theme.MvvmProjectTheme
import com.example.mvvmproject.view.QuoteProject.QuoteScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MvvmProjectTheme {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MvvmProjectTheme {
        QuoteScreen()
    }
}