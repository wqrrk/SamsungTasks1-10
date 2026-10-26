package com.example.practice1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import com.example.practice1.tasks.Hello
import com.example.practice1.tasks.Task4
import com.example.practice1.tasks.Task5
import com.example.practice1.tasks.Task6First
import com.example.practice1.tasks.WaterTracker
import com.example.practice1.tasks.ShoppingCartScreen



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                ShoppingCartScreen()
            }
        }
    }
}
