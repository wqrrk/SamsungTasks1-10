package com.example.practice1.tasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practice1.R

// Задание 6.1
@Composable
fun Task6First() {
    Box(
        modifier = Modifier
            .size(width = 240.dp, height = 120.dp)
            .background(Color.Black),
        contentAlignment = Alignment.TopEnd
    ) {
        Image(
            painter = painterResource(R.drawable.circle),
            contentDescription = "Оранжевый круг"
        )
    }
}

// Задание 6.2
@Composable
fun Task6Second() {
    Box(
        modifier = Modifier
            .size(width = 240.dp, height = 120.dp)
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(R.drawable.circle),
            contentDescription = "Фиолетовый круг",
            modifier = Modifier.size(240.dp, 120.dp),
            contentScale = ContentScale.FillBounds,
            colorFilter = ColorFilter.tint(Color.Magenta)
        )
    }
}

@Preview(
    name = "Task 6.1",
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Task6FirstPreview() {
    Task6First()
}

@Preview(
    name = "Task 6.2",
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Task6SecondPreview() {
    Task6Second()
}
