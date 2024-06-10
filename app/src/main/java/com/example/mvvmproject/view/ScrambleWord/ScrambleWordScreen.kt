package com.example.mvvmproject.view.ScrambleWord

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmproject.ui.theme.MvvmProjectTheme
import com.example.mvvmproject.viewmodel.ScrambleWordViewModel

@Composable
fun ScrambleWordScreen(vm:ScrambleWordViewModel = viewModel()) {
    val scrambleWord = vm.word.collectAsState()
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .size(350.dp)
                .clip(RoundedCornerShape(8))
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = scrambleWord.value,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = ExtraBold,
                        fontSize = 45.sp
                    ),
                    modifier = Modifier.padding(bottom = 50.dp)
                )
                OutlinedTextField(
                    value = "gWrod",
                    onValueChange = { "gWord" },
                    modifier = Modifier
                        .border(
                            2.dp,
                            MaterialTheme.colorScheme.onBackground,
                            RoundedCornerShape(100),
                        )
                        .clip(
                            RoundedCornerShape(100)
                        )
                )
                Button(
                    onClick = { vm.scrambleLogic() },
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .size(150.dp, 55.dp)
                ) {
                    Text(text = "Guess!", style = MaterialTheme.typography.bodyLarge)
                }
            }
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