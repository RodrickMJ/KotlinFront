package com.example.appc8.features.home.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appc8.R

@Composable
fun HomeScreen () {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp)
            .background(Color.White)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(Color(0xFF8985EF))
            ) {
                NavHome()
            }

            Box(
                modifier = Modifier
                    .fillMaxSize().background(Color.White).height(40.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.image_home),
                    contentDescription = "great home Background",


                )
            }
        }
    }
}