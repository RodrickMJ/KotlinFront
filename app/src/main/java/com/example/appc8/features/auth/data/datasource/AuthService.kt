package com.example.appc8.features.auth.data.datasource

import com.example.appc8.features.auth.data.models.AuthResponseDto
import com.example.appc8.features.auth.data.models.LoginAuthDto
import com.example.appc8.features.auth.data.models.RegisterAuthDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("/auth/create")
    suspend fun registerUser(@Body request: RegisterAuthDto): AuthResponseDto

    @POST("/auth/access")
    suspend fun accessUser(@Body request: LoginAuthDto): AuthResponseDto
}