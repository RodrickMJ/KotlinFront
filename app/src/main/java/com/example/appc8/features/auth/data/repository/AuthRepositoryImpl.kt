package com.example.appc8.features.auth.data.repository

import com.example.appc8.features.auth.data.datasource.AuthService
import com.example.appc8.features.auth.domain.models.AuthResponse
import com.example.appc8.features.auth.domain.models.LoginAuth
import com.example.appc8.features.auth.domain.models.RegisterAuth
import com.example.appc8.features.auth.domain.repository.AuthRepository

class AuthRepositoryImpl (private val api: AuthService): AuthRepository {
    override suspend fun access(request: LoginAuth): AuthResponse {
        val response = api.accessUser(request.toDo())
        return response.toDomain()
    }

    override suspend fun register(registerAuth: RegisterAuth): AuthResponse {
        val response = api.registerUser(registerAuth.toDo())
        return response.toDomain()
    }
}