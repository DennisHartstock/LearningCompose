package com.commcode.learningcompose.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun InstagramProfileCard() {
    Card(
        shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp),
        backgroundColor = Color.White,
        border = BorderStroke(1.dp, color = Color.Black)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Green)
                    .border(2.dp, color = Color.Gray)
            ) {

            }
            Column()
            Column()
            Column()
        }
    }
}

@Composable
private fun Column() {
    Column(
        modifier = Modifier
            .border(2.dp, color = Color.Gray)
            .height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            modifier = Modifier
                .size(25.dp)
                .background(color = Color.Red)
        )
        Box(
            modifier = Modifier
                .size(25.dp)
                .background(color = Color.Magenta)
        )
    }
}