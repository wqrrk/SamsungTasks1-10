package com.example.practice1

import android.content.ComponentName
import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.practice1.tasks.WaterTracker
import org.junit.Rule
import org.junit.Test

class WaterTrackerTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    // Тест 1: проверка добавления воды
    @Test
    fun addWaterTest() {
        composeTestRule.setContent {
            WaterTracker()
        }

        composeTestRule
            .onNodeWithText("+250 мл")
            .assertExists()
            .performClick()

        composeTestRule
            .onNodeWithText("250 мл")
            .assertIsDisplayed()
    }

    // Тест 2: проверка завершения дня
    @Test
    fun finishDayTest() {
        composeTestRule.setContent {
            WaterTracker()
        }

        composeTestRule
            .onNodeWithText("+250 мл")
            .performClick()

        composeTestRule
            .onNodeWithText("Завершить день")
            .assertExists()
            .performClick()

        composeTestRule
            .onNodeWithText("0 мл")
            .assertIsDisplayed()
    }

    // Тест 3: проверка дней подряд
    @Test
    fun daysStreakTest() {
        composeTestRule.setContent {
            WaterTracker()
        }

        // Выпиваем 1500 мл
        repeat(6) {
            composeTestRule
                .onNodeWithText("+250 мл")
                .performClick()
        }

        composeTestRule
            .onNodeWithText("Завершить день")
            .performClick()

        composeTestRule
            .onNodeWithText(
                "Дней подряд с 1500 мл и больше: 1"
            )
            .assertIsDisplayed()

        // Завершаем следующий день без воды
        composeTestRule
            .onNodeWithText("Завершить день")
            .performClick()

        composeTestRule
            .onNodeWithText(
                "Дней подряд с 1500 мл и больше: 0"
            )
            .assertIsDisplayed()
    }
}
