package com.example.appc8.core.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appc8.features.auth.presentation.view.AuthScreen


@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Auth") {

        composable("Auth") {
            AuthScreen { userId ->
                navController.navigate("Home/$userId")
            }
        }


    }
}