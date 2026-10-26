package com.example.practice1.tasks

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

data class Cart(
    val products: List<Product>
)

data class Product(
    val id: Int,
    val name: String,
    val price: Int
)

@Composable
fun ShoppingCartScreen() {
    val context = LocalContext.current

    var products by remember() {
        mutableStateOf(
            listOf(
                Product(0, "Товар #1", 100),
                Product(1, "Товар #2", 150),
                Product(2, "Товар #3", 56)
            )
        )
    }

    val totalSum = products.sumOf { it.price }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        for (product in products) {
            Text(
                text = "${product.name} - ${product.price} рублей"
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text("Товаров на сумму: $totalSum рублей")

        AddProductSection {
            val nextId = (products.maxOfOrNull { it.id } ?: -1) + 1

            val newProduct = Product(
                id = nextId,
                name = "Товар #${nextId + 1}",
                price = Random.nextInt(0, 100)
            )

            products = products + newProduct

            if (products.sumOf { it.price } > 500) {
                Toast.makeText(
                    context,
                    "Доставка бесплатная!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        if (products.isNotEmpty()) {
            RemoveProductSection {
                products = products.dropLast(1)
            }
        }
    }
}

@Composable
fun AddProductSection(onAdd: () -> Unit) {
    Button(onClick = onAdd) {
        Text("Добавить товар")
    }
}

@Composable
fun RemoveProductSection(onRemove: () -> Unit) {
    Button(onClick = onRemove) {
        Text("Удалить товар")
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Task10Preview() {
    ShoppingCartScreen()
}
