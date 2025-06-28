package com.example.appc8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.appc8.core.navegation.NavigationWrapper
import com.example.appc8.features.auth.presentation.view.LoginScreen
import com.example.appc8.features.auth.presentation.view.RegisterScreen
import com.example.appc8.features.home.presentation.view.HomeScreen

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            //LoginScreen()
            //RegisterScreen()
            HomeScreen()
            //NavigationWrapper()
        }
    }
}