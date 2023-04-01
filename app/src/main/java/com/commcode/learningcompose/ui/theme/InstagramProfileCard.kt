package com.commcode.learningcompose.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.commcode.learningcompose.R

@Composable
fun InstagramProfileCard() {
    Card(
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp),
        backgroundColor = MaterialTheme.colors.background,
        border = BorderStroke(1.dp, color = MaterialTheme.colors.onBackground)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(50.dp),
                painter = painterResource(id = R.drawable.ic_instagram),
                contentDescription = "Instagram Logo",
                contentScale = ContentScale.Crop
            )
            UserStatistics(value = "4.956", title = "Posts")
            UserStatistics(value = "45M", title = "Followers")
            UserStatistics(value = "25", title = "Following")
        }
    }
}

@Composable
private fun UserStatistics(value: String, title: String) {
    Column(
        modifier = Modifier
            .border(2.dp, color = Color.Gray)
            .height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = value, fontSize = 36.sp, fontFamily = FontFamily.Cursive
        )
        Text(
            text = title, fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun PreviewCardLight() {
    LearningComposeTheme(darkTheme = false) {
        InstagramProfileCard()
    }
}

@Preview
@Composable
fun PreviewCardDark() {
    LearningComposeTheme(darkTheme = true) {
        InstagramProfileCard()
    }
}