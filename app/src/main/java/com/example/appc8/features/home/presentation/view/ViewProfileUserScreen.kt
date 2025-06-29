package com.example.appc8.features.home.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appc8.R

@Composable
fun ViewProfileUserScreen() {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        val description: String = "Soy un usuario activo de la plataforma."

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFFF3B2DB),
                            Color(0xFF6FCFEB)
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(30.dp)
            ) {
                Row(
                    modifier = Modifier
                        .clickable { }
                        .width(80.dp)
                        .height(35.dp)
                        .align(Alignment.TopEnd),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(30.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.icon_edith),
                            contentDescription = "icon edit",
                            modifier = Modifier
                                .size(16.dp)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .height(40.dp)
                            .width(245.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            text = "Edit",
                            color = Color.Blue,
                            fontSize = 22.sp,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.W500
                        )
                    }

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .align(Alignment.BottomCenter),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.icon_profile),
                        contentDescription = "icon profile",
                        modifier = Modifier
                            .height(50.dp)
                            .width(70.dp)
                    )
                    Box(
                        modifier = Modifier
                            .height(40.dp)
                            .width(245.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            text = "Profile User",
                            color = Color.Black,
                            fontSize = 22.sp,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.W500
                        )
                    }

                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .weight(1f)
        ) {
            Column (
                modifier = Modifier
                    .fillMaxSize(1f)
                    .padding(20.dp)
            ) {
                Text(
                    text = "E-mail:",
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.W500
                )
                Text(
                    text = "ejemplo@gmail.com",
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier.padding(12.dp)
                )
                Text(
                    text = "Phone:",
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.W500
                )
                Text(
                    text = "(52) 967-139-3797",
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier.padding(12.dp)
                )
                Text(
                    text = "Description:",
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.W500
                )
                Text(
                    text = description,
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier.padding(12.dp)
                )
            }
            Row(
                modifier = Modifier
                    .clickable { }
                    .width(160.dp)
                    .height(35.dp)
                    .align(Alignment.BottomCenter),
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(30.dp),
                    contentAlignment = Alignment.Center
                ){
                    Image(
                        painter = painterResource(id = R.drawable.drop_profile),
                        contentDescription = "icon Drop Profile",
                        modifier = Modifier
                            .size(16.dp)
                    )
                }
                Box(
                    modifier = Modifier
                        .height(40.dp)
                        .width(245.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Drop Profile",
                        color = Color.Red,
                        fontSize = 22.sp,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.W500
                    )
                }

            }
        }
    }
}