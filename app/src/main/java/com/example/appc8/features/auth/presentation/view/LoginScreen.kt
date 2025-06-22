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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appc8.R

@Composable()
fun LoginScreen (

){
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
                .background(Color.White, shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                .fillMaxHeight(0.6f)
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .background(Color.White)
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

            }

            Text(
                modifier = Modifier.fillMaxWidth().padding(15.dp),
                text = "E-mail",
                color = Color(0xFF6C63FF),
                fontSize = 17.sp,
                fontWeight = FontWeight.W400

            )

            TextField (
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.13f)
                    .border(2.dp, Color(0xFF6C63FF), shape = RoundedCornerShape(27.dp))
                    ,
                value = "",
                onValueChange = {},
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
                    .fillMaxHeight(0.18f)
                    .border(2.dp, Color(0xFF6C63FF), shape = RoundedCornerShape(27.dp)),
                value = "",
                onValueChange = {},
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
                    .fillMaxHeight(0.35f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6C63FF)
                ),

                onClick = {

                }
            ) {

                Text(
                    color = Color.White,
                    text = "Login",
                    fontSize = 20.sp,
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth(0.80f)
                    .height(55.dp)
                    .background(Color.White)
                    .drawBehind {
                        val strokeWidth = 2.dp.toPx()
                        val y = size.height - strokeWidth / 2
                        drawLine(
                            color = Color.Black,
                            start = Offset(0f, y),
                            end = Offset(size.width, y),
                            strokeWidth = strokeWidth
                        )
                    }
            )
            {

            }


        }

    }
}