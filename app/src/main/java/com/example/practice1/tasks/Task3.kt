
package com.example.practice1.tasks

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice1.R

@Composable
fun Task3() {
    val message = stringResource(R.string.compose_description)

    Column(
        modifier = Modifier.padding(40.dp)
    ) {
        // 1. Зелёный, курсив, 16sp, по центру
        Text(
            text = message,
            color = Color.Green,
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center
        )

        // 2. Одна строка с многоточием
        Text(
            text = message,
            modifier = Modifier.padding(top = 20.dp),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        // 3. Чёрный текст, зелёный фон,
        // подчёркивание, 24sp, отступ 48sp
        Text(
            text = message,
            modifier = Modifier
                .padding(top = 20.dp)
                .background(Color.Green),
            color = Color.Black,
            fontSize = 24.sp,
            textDecoration = TextDecoration.Underline,
            style = TextStyle(
                textIndent = TextIndent(firstLine = 48.sp)
            )
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Task3Preview() {
    Task3()
}
