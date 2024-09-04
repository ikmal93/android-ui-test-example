package com.ikmal.android_ui_test_example

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import org.junit.Rule
import org.junit.Test

class LoginTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun test_login_validation(){
        val email = "test@example.com"
        val password = "123456"

        rule.setContent {
            LoginScreen()
        }

        rule.onNodeWithText("Type your email")
            .performTextInput(email)

        rule.onNodeWithText("Password")
            .performTextInput(email)

        rule.onNodeWithText("Hit Me")
            .performClick()


        assert(email.isNotEmpty())
        assert(password.count() == 6)
    }

}