package com.example.appc8.features.auth.domain.repository

import com.example.appc8.features.auth.domain.models.AuthResponse
import com.example.appc8.features.auth.domain.models.LoginAuth
import com.example.appc8.features.auth.domain.models.RegisterAuth

interface AuthRepository {
    suspend fun access(request: LoginAuth):AuthResponse
    suspend fun register(registerAuth: RegisterAuth): AuthResponse
}