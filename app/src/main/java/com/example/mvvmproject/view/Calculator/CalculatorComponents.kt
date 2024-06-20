package com.example.mvvmproject.view.Calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmproject.model.Calculator
import com.example.mvvmproject.ui.theme.MvvmProjectTheme
import com.example.mvvmproject.viewmodel.CalculatorViewModel

@Composable
fun TopAppBar(vm: CalculatorViewModel = viewModel()) {
    val value = vm.calculator
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .clip(RoundedCornerShape(bottomEnd = 16.dp, bottomStart = 16.dp))
            .background(MaterialTheme.colorScheme.background.copy(1f, 0.1f, 0.1f, 0.1f)),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.Bottom
    ) {
        Text(
            text = value.toString(),
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 60.sp,
                fontWeight = FontWeight.Bold
            ),
            color = Color.White,
            modifier = Modifier.padding(bottom = 40.dp)
        )
    }
}

@Composable
fun CalculatorLayout() {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp)
            .navigationBarsPadding()
            .statusBarsPadding(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Row {
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .width(180.dp)
                        .height(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "c", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "%", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "/", style = MaterialTheme.typography.bodyLarge)
                }
            }
            Row {
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "7", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "8", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "9", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "x", style = MaterialTheme.typography.bodyLarge)
                }
            }
            Row {
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "4", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "5", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "6", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "-", style = MaterialTheme.typography.bodyLarge)
                }
            }
            Row {
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "1", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "2", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "3", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "+", style = MaterialTheme.typography.bodyLarge)
                }
            }
            Row {
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "0", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = ".", style = MaterialTheme.typography.bodyLarge)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Icon(imageVector = Icons.Default.Delete, contentDescription = null)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .size(90.dp)
                        .padding(4.dp)
                ) {
                    Text(text = "=", style = MaterialTheme.typography.bodyLarge)
                }
            }
        }


}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    MvvmProjectTheme {
        CalculatorLayout()
    }
}