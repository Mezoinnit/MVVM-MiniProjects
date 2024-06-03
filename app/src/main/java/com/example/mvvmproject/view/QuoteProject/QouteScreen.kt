package com.example.mvvmproject.view.QuoteProject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmproject.model.QuoteData
import com.example.mvvmproject.viewmodel.QuoteViewModel


@Composable
fun QuoteScreen(vm:QuoteViewModel = viewModel()) {

    val quote = vm.quoteValue.collectAsState()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = quote.value.toMutableList()[0].quote, style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold))

        Button(onClick = { vm.loadQuote() }) {
            Text(text = "Generate Quote!")
        }

    }
}