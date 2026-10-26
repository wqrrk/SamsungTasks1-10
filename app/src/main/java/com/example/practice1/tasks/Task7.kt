package com.example.practice1.tasks

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Первый вариант Column
@Composable
fun Task7First() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .padding(top = 20.dp)
    ) {
        Text("Имя: Евгений")
        Text("Фамилия: Андреевич")
        Text("Отчество: Лукашин")
        Text("Телефон: +7 495 495-95-95")
        Text("Адрес: г. Москва, 3-я улица строителей")
    }
}

// Второй вариант Column
@Composable
fun Task7Second() {
    val contacts = listOf(
        listOf(
            "Евгений", "Андреевич", "Лукашкин",
            "+7 495 495 95 95",
            "г. Москва, 3-я улица Строителей, д. 25, кв. 12"
        ),
        listOf(
            "Василий", "Егорович", "Кузякин",
            "---",
            "Ивановская область, дер. Крутово, д. 4"
        ),
        listOf(
            "Людмила", "Прокофьевна", "Калугина",
            "+7 495 788 78 78",
            "Москва, Большая Никитская, д. 43, кв. 290"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        contacts.forEach { contact ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Имя: ${contact[0]}")
                Text("Отчество: ${contact[1]}")
                Text("Фамилия: ${contact[2]}")
                Text("Мобильный телефон: ${contact[3]}")
                Text(
                    text = "Адрес: ${contact[4]}",
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

// Третий вариант Row
@Composable
fun Task7Third() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.LightGray)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Имя: Евгений")
            Text("Фамилия: Андреевич")
            Text("Отчество: Лукашин")
            Text("Телефон: +7 495 495-95-95")
            Text("Адрес: г. Москва, 3-я улица строителей")
        }

        Box(
            modifier = Modifier
                .size(64.dp)
                .background(Color(0xFFFF5722)),
            contentAlignment = Alignment.Center
        ) {
            Text("ЕА", color = Color.Black)
        }
    }
}

@Preview(
    name = "Column 1",
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Task7FirstPreview() {
    Task7First()
}

@Preview(
    name = "Column 2",
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Task7SecondPreview() {
    Task7Second()
}

@Preview(
    name = "Row",
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Task7ThirdPreview() {
    Task7Third()
}
