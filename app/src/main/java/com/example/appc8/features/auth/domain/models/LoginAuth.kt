package com.example.appc8.features.auth.domain.models

import com.example.appc8.features.auth.data.models.LoginAuthDto

data class LoginAuth(
    val email:String,
    val password:String
) {
    fun toDo() = LoginAuthDto(email, password)
}
