package com.example.appc8.features.auth.presentation.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun AuthScreen(navigationToHome: (String) -> Unit) {
    val isLogin = remember { mutableStateOf(true) }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        if (isLogin.value) {
            LoginScreen(
                onToggle = { isLogin.value = false },
                onLoginSuccess = { userId -> navigationToHome(userId) }
            )
        } else {
            RegisterScreen(
                onToggle = { isLogin.value = true },
                onLoginSuccess = { userId -> navigationToHome(userId) }
            )
        }
    }
}