package com.example.appc8.features.auth.domain.models

data class User(
    val id: String,
    val name: String,
    val email: String,
    val role: String
)
