package com.example.appc8.features.auth.data.models

import com.example.appc8.features.auth.domain.models.RegisterAuth

data class RegisterAuthDto(
    val name: String,
    val email: String,
    val password: String
) {
    fun toDomain() = RegisterAuth(
        name = name,
        email = email,
        password = password
    )
}

