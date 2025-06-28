package com.example.appc8.features.auth.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.appc8.features.auth.domain.usecase.LoginAuthUseCase

class LoginViewModelFactory (
    private val accessUseCase: LoginAuthUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(accessUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}