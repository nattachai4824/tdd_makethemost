package ns.example.makethemost

import android.graphics.Color
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

//    @get: Rule
//    val composeTestRule = createAndroidComposeRule<MainActivity>()
//
//    @Test
//    fun initial_screen() {
//        composeTestRule.onNodeWithText("MAKE THE MOST").assertIsDisplayed()
//        composeTestRule.onNodeWithText("0").assertIsDisplayed()
//        composeTestRule.onNodeWithText("GO").assertIsDisplayed()
//    }
//
//    @Test
//    fun score_first_time_screen() {
//        composeTestRule.onNodeWithText("GO").performClick()
//        composeTestRule.onNodeWithText("MORE").assertIsDisplayed()
//
//        val firstScore = composeTestRule.activity.viewModel.firstScore.value
//        val currentValue = composeTestRule.activity.viewModel.currentScore.value
//        composeTestRule.onNodeWithText("YOU GOT $firstScore").assertIsDisplayed()
//        composeTestRule.onNodeWithText(currentValue.toString()).assertIsDisplayed()
//    }
//
//    @Test
//    fun score_second_time_screen() {
//        composeTestRule.onNodeWithText("GO").performClick()
//        composeTestRule.onNodeWithText("MORE").performClick()
//        composeTestRule.onNodeWithText("DONE").assertIsDisplayed()
//
//        val secondScore = composeTestRule.activity.viewModel.secondScore.value
//        val currentValue = composeTestRule.activity.viewModel.currentScore.value
//
//        composeTestRule.onNodeWithText("YOU GOT $secondScore").assertIsDisplayed()
//        composeTestRule.onNodeWithText(currentValue.toString()).assertIsDisplayed()
//    }
//
//    @Test
//    fun score_done_clicked_screen() {
//        composeTestRule.onNodeWithText("GO").performClick()
//        composeTestRule.onNodeWithText("MORE").performClick()
//        composeTestRule.onNodeWithText("DONE").performClick()
//
//        composeTestRule.onNodeWithText("MAKE THE MOST").assertIsDisplayed()
//        composeTestRule.onNodeWithText("0").assertIsDisplayed()
//        composeTestRule.onNodeWithText("GO").assertIsDisplayed()
//    }
}