package com.example.appc8.features.auth.domain.models

data class AuthResponse(
    val data: User,
    val token: String
)
