package com.example.appc8.features.auth.presentation.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip

@Composable
fun NavLRScreen(selected: Boolean, onToggle: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .clip(RoundedCornerShape(18.dp))
    ) {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .clickable {
                        if (!selected) {
                            onToggle()
                        }
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Login",
                    color = if (selected) Color(0xFF6C63FF) else Color.Gray,
                    fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal,
                    fontSize = 18.sp
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .clickable {
                        if (selected) {
                            onToggle()
                        }
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Sign Up",
                    color = if (!selected) Color(0xFF6C63FF) else Color.Gray,
                    fontWeight = if (!selected) FontWeight.Bold else FontWeight.Normal,
                    fontSize = 18.sp
                )
            }
        }
    }
}