package com.example.appc8.features.auth.data.di

import com.example.appc8.core.http.RetrofitHelper
import com.example.appc8.features.auth.data.datasource.AuthService
import com.example.appc8.features.auth.data.repository.AuthRepositoryImpl
import com.example.appc8.features.auth.domain.repository.AuthRepository
import com.example.appc8.features.auth.domain.usecase.LoginAuthUseCase
import com.example.appc8.features.auth.domain.usecase.RegisterAuthUseCase

object AppModule {
    private val api: AuthService = RetrofitHelper.retrofit.create(AuthService::class.java)

    private val repository: AuthRepository = AuthRepositoryImpl(api)

    val accessUseCase = LoginAuthUseCase(repository)
    val registerUseCase = RegisterAuthUseCase(repository)
}