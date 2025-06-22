package com.example.appc8.features.auth.data.models

import com.example.appc8.features.auth.domain.models.User

data class UserDto(
    val id: String,
    val name: String,
    val email: String,
    val role: String
) {
    fun toDomain() = User (
        id = id,
        name = name,
        email = email,
        role = role
    )
}
