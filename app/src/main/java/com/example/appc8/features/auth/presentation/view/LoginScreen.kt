package com.example.appc8.features.auth.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appc8.R
import com.example.appc8.features.auth.data.di.AppModule
import com.example.appc8.features.auth.presentation.viewModel.LoginViewModel
import com.example.appc8.features.auth.presentation.viewModel.LoginViewModelFactory
import kotlinx.coroutines.launch

@Composable()
fun LoginScreen (
    onToggle: ()-> Unit,
    onLoginSuccess: (String) -> Unit
){
    val viewModel: LoginViewModel = viewModel(
        factory = LoginViewModelFactory(AppModule.accessUseCase)

    )

    val email: String by viewModel.email.collectAsState("")
    val password: String by viewModel.password.collectAsState("")
    val message: String by viewModel.message.collectAsState("")
    val success: Boolean by viewModel.success.collectAsState(false)
    val isLoading: Boolean by viewModel.isLoading.collectAsState(false)
    val userId: String by viewModel.userId.collectAsState()

    if (success && userId.isNotEmpty()) {
        onLoginSuccess(userId)
    }

    LaunchedEffect (Unit) {
        viewModel.resetFields()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6C63FF))
    ){

        Column (
            modifier = Modifier
                .align(Alignment.TopStart)
                .fillMaxHeight(0.37f)
                .fillMaxWidth()
                .padding(20.dp),
                //.background(Color.Black),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                modifier = Modifier.padding(vertical = 15.dp),
                text = "Hey!",
                color = Color.White,
                fontSize = 50.sp,
                fontWeight = FontWeight.W400,

            )
            Text(
                text = "Welcome Back",
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.W400
            )
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color(0xFFECEBFE), shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                .height(515.dp)
                .padding(28.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .clip(RoundedCornerShape(50))
                    .clip(RoundedCornerShape(18.dp))
                    .drawBehind {
                        val strokeWidth = 2.dp.toPx()
                        val y = size.height - strokeWidth / 2
                        drawLine(
                            color = Color(0xFF6C63FF),
                            start = Offset(0f, y),
                            end = Offset(size.width, y),
                            strokeWidth = strokeWidth
                        )
                    }
            )
            {
                NavLRScreen(
                    selected = true,
                    onToggle = { onToggle()}
                )

            }


            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 40.dp,
                        start = 15.dp,
                        bottom = 15.dp
                    ),
                text = "E-mail",
                color = Color(0xFF6C63FF),
                fontSize = 17.sp,
                fontWeight = FontWeight.W400

            )

            TextField (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.White, shape = RoundedCornerShape(27.dp))
                    .border(2.dp, Color(0xFF6C63FF), shape = RoundedCornerShape(27.dp))
                    ,
                value = email,
                textStyle = TextStyle(fontSize = 16.sp),
                onValueChange = {viewModel.onChangeEmail(it)},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    cursorColor = Color.Black,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                ),

            )

            Text(
                modifier = Modifier.fillMaxWidth().padding(15.dp),
                text = "Password",
                color = Color(0xFF6C63FF),
                fontSize = 17.sp,
                fontWeight = FontWeight.W400

            )

            TextField (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.White, shape = RoundedCornerShape(27.dp))
                    .border(2.dp, Color(0xFF6C63FF), shape = RoundedCornerShape(27.dp)),
                value = password,
                textStyle = TextStyle(fontSize = 16.sp),
                onValueChange = {viewModel.onChangePassword(it)},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    cursorColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent
                ),
            )

            Button(
                modifier = Modifier
                    .fillMaxWidth(0.60f)
                    .padding(vertical = 30.dp)
                    .height(45.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6C63FF)
                ),
                enabled = !isLoading,

                onClick = {
                    viewModel.viewModelScope.launch {
                        viewModel.onClick()
                    }
                }
            ) {

                Text(
                    color = Color.White,
                    text = "Login",
                    fontSize = 20.sp,
                )
            }

            if (message.isNotEmpty()) {
                Text(
                    text = message,
                    color = if (success) Color(0xFF4CAF50) else Color.Red,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 14.dp)
                )
            }


        }

    }
}