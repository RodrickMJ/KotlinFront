package com.example.appc8.features.home.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewModelScope
import com.example.appc8.R
import kotlinx.coroutines.launch

@Composable
fun EditProfileUserScreen (

) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(45.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .clickable { }
                            .width(130.dp)
                            .height(45.dp),
                    ) {
                        Box(
                            modifier = Modifier
                                .height(45.dp)
                                .width(50.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.icon_return),
                                contentDescription = "icon return",
                                modifier = Modifier
                                    .size(500.dp)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .height(45.dp)
                                .width(245.dp),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            Text(
                                text = "Return",
                                color = Color.Black,
                                fontSize = 25.sp,
                                textAlign = TextAlign.Left,
                                fontWeight = FontWeight.W300
                            )
                        }

                    }
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize(),
                    contentAlignment = Alignment.CenterEnd
                ) {
                    Row(
                        modifier = Modifier
                            .clickable { }
                            .width(95.dp)
                            .height(40.dp)
                            .border(2.dp, Color(0xFF3E9B42), shape = RoundedCornerShape(10.dp)),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Box(
                            modifier = Modifier
                                .height(45.dp)
                                .width(55.dp),
                            contentAlignment = Alignment.CenterEnd
                        ) {
                            Text(
                                text = "Save",
                                color = Color.Black,
                                fontSize = 24.sp,
                                textAlign = TextAlign.Left,
                                fontWeight = FontWeight.W300
                            )
                        }
                        Box(
                            modifier = Modifier
                                .height(45.dp)
                                .width(40.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.icon_save),
                                contentDescription = "icon save",
                                modifier = Modifier
                                    .size(20.dp)
                            )
                        }

                    }
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    //.background(Color.Gray)
                    ,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)

                ){
                    Image(
                        painter = painterResource(id = R.drawable.icon_profile),
                        contentDescription = "great home Background",
                        modifier = Modifier
                            .size(100.dp)
                            .align(Alignment.Center)
                        )
                }
                Box(
                    modifier = Modifier
                        .weight(1f),
                ){
                    Text(
                        modifier = Modifier.clickable {  },
                        text = "Edith Photo",
                        color = Color.Black,
                        fontWeight = FontWeight.W500,
                        fontSize = 22.sp,
                        textAlign = TextAlign.Center,
                        )
                }
            }

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    //.background(Color.LightGray)
                    .padding(15.dp)
            ) {
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "Name:",
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Left,
                    )

                TextField (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(Color.White, shape = RoundedCornerShape(10.dp))
                        .border(2.dp, Color(0xFF6C63FF), shape = RoundedCornerShape(10.dp))
                    ,
                    value = "",
                    textStyle = TextStyle(fontSize = 16.sp),
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
                    modifier = Modifier.padding(10.dp),
                    text = "E-mail:",
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Left,
                )

                TextField (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(Color.White, shape = RoundedCornerShape(10.dp))
                        .border(2.dp, Color(0xFF6C63FF), shape = RoundedCornerShape(10.dp))
                    ,
                    value = "",
                    textStyle = TextStyle(fontSize = 16.sp),
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
                    modifier = Modifier.padding(10.dp),
                    text = "Phone Number:",
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Left,
                )

                TextField (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(Color.White, shape = RoundedCornerShape(10.dp))
                        .border(2.dp, Color(0xFF6C63FF), shape = RoundedCornerShape(10.dp))
                    ,
                    value = "",
                    textStyle = TextStyle(fontSize = 16.sp),
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
                    modifier = Modifier.padding(10.dp),
                    text = "Description:",
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Left,
                )

                TextField (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .background(Color.White, shape = RoundedCornerShape(10.dp))
                        .border(2.dp, Color(0xFF6C63FF), shape = RoundedCornerShape(10.dp))
                    ,
                    value = "",
                    textStyle = TextStyle(fontSize = 16.sp),
                    onValueChange = {},
                    colors = TextFieldDefaults.colors(
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        cursorColor = Color.Black,
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                    ),
                )
            }

//            Row (
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(45.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceAround
//            ) {
//                Button(
//
//                    modifier = Modifier
//                        .width(120.dp)
//                        .height(45.dp),
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = Color(0xFF16D2C0)
//                    ),
//
//                    onClick = {
//
//                    }
//                ) {
//
//                    Text(
//                        color = Color.White,
//                        text = "Update",
//                        fontSize = 20.sp,
//                    )
//                }
//
//                Button(
//                    modifier = Modifier
//                        .width(120.dp)
//                        .height(45.dp),
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = Color(0xFFE91E63)
//                    ),
//
//                    onClick = {
//
//                    }
//                ) {
//
//                    Text(
//                        color = Color.White,
//                        text = "Cancel",
//                        fontSize = 20.sp,
//                    )
//                }
//            }
        }
    }
}