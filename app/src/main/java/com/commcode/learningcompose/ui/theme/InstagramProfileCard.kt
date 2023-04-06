package com.commcode.learningcompose.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun InstagramProfileCard(
    viewModel: MainViewModel
) {
    val isFollowed = viewModel.isFollowing.observeAsState(false)

    Card(
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp),
        backgroundColor = MaterialTheme.colors.background,
        border = BorderStroke(1.dp, color = MaterialTheme.colors.onBackground)
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(8.dp),
                    painter = painterResource(id = R.drawable.ic_instagram),
                    contentDescription = "Instagram Logo",
                    contentScale = ContentScale.Crop
                )
                UserStatistics(value = "4.956", title = "Posts")
                UserStatistics(value = "45M", title = "Followers")
                UserStatistics(value = "25", title = "Following")
            }
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Instagram", fontSize = 30.sp,
                    fontFamily = FontFamily.Cursive
                )
                Text(text = "#HashTag")
                Text(text = "Homepage")
                FollowButton(isFollowed = isFollowed.value) {
                    viewModel.changeFollowingStatus
                }
            }
        }
    }
}

@Composable
private fun FollowButton(
    isFollowed: Boolean,
    clickListener: () -> Unit
) {
    Button(
        onClick = { clickListener() },
    colors = ButtonDefaults.buttonColors (
        backgroundColor = if(isFollowed) {
            MaterialTheme.colors.primary.copy(alpha = 0.5f)
        } else {
            MaterialTheme.colors.primary
        }
    )
    ) {
        val text = if(isFollowed) {
            "Unfollow"
        } else {
            "Follow"
        }
        Text(text = text)
    }
}

@Composable
private fun UserStatistics(value: String, title: String) {
    Column(
        modifier = Modifier
            .height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            modifier = Modifier.padding(start = 4.dp, end = 4.dp),
            text = value, fontSize = 24.sp, fontFamily = FontFamily.Cursive
        )
        Text(
            modifier = Modifier.padding(start = 4.dp, end = 4.dp),
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