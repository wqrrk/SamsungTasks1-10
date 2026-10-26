package com.example.practice1.tasks

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WaterTracker() {

    var waterCount by remember { mutableIntStateOf(0) }
    var daysStreak by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Трекер воды",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3F5F91)
        )

        Spacer(modifier = Modifier.height(48.dp))

        Text(
            text = "$waterCount мл",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF526481)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                waterCount += 250
            }
        ) {
            Text("+250 мл", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                if (waterCount >= 1500) {
                    daysStreak++
                } else {
                    daysStreak = 0
                }

                waterCount = 0
            }
        ) {
            Text("Завершить день")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Дней подряд с 1500 мл и больше: $daysStreak",
            fontSize = 18.sp
        )
    }
}



@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Task8Preview() {
    WaterTracker()
}
