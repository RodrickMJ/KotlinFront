package com.example.appc8.features.auth.domain.usecase

import com.example.appc8.features.auth.domain.models.AuthResponse
import com.example.appc8.features.auth.domain.models.RegisterAuth
import com.example.appc8.features.auth.domain.repository.AuthRepository

class RegisterAuthUseCase(private val repository: AuthRepository) {
    suspend operator fun invoke(request: RegisterAuth): AuthResponse{
        return repository.register(request)
    }
}