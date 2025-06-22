package com.example.appc8.features.auth.data.models

import com.example.appc8.features.auth.domain.models.LoginAuth

data class LoginAuthDto(
    val email: String,
    val password: String
) {
    fun toDomain() = LoginAuth(
        email = email,
        password = password
    )
}
