package com.example.mvvmproject.view.ScrambleWord

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvvmproject.ui.theme.MvvmProjectTheme

@Composable
fun ScrambleWordScreen(){
    Column {
        Text(text = "word")
        Button(onClick = { /*TODO:ScrambleWordLogic*/ }) {
            Text(text = "Text")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MvvmProjectTheme {
        ScrambleWordScreen()
    }
}