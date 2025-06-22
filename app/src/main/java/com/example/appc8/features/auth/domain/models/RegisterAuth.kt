package com.example.appc8.features.auth.domain.models

import com.example.appc8.features.auth.data.models.RegisterAuthDto

data class RegisterAuth(
    val name: String,
    val email: String,
    val password: String
) {
    fun toDo() = RegisterAuthDto(name, email, password)
}
