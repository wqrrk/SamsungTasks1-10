
package com.example.practice1.tasks

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

//task1
@Composable
fun Hello(name: String?) {
    Text(
        text = if (name == null) "Имя не задано"
        else "Привет, $name!"
    )
}



//task2
// Вертикальный экран
@Preview(
    name = "Portrait",
    showSystemUi = true,
    showBackground = true,
    device = "spec:width=400dp,height=800dp"
)
@Composable
fun HelloPreviewPortrait() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Hello("Ярослав")
    }
}

// Горизонтальный экран
@Preview(
    name = "Landscape",
    showSystemUi = true,
    showBackground = true,
    device = "spec:width=800dp,height=400dp"
)
@Composable
fun HelloPreviewLandscape() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Hello("Ярослав")
    }
}

// Круглый экран
@Preview(
    name = "Round",
    showSystemUi = true,
    showBackground = true,
    device = "spec:width=200dp,height=200dp,isRound=true"
)
@Composable
fun HelloPreviewRound() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
        Hello("Ярослав")
    }
}

