package com.example.appc8.features.home.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appc8.R

@Composable
fun NavHome(

) {
    Box(
        modifier = Modifier
            .fillMaxSize().background(Color(0xFF8985EF)),
        contentAlignment = Alignment.Center,

    ) {
        Row (
            modifier = Modifier
                .width(330.dp)
                .height(50.dp)

        ) {
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.CenterStart
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_home),
                    contentDescription = "icon home navbar",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .clickable { },

                )
            }

            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.CenterEnd
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_profile),
                    contentDescription = "icon home navbar",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .clickable { },

                    )
            }
        }
    }
}