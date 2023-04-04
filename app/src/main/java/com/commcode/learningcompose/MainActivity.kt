package com.commcode.learningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import com.commcode.learningcompose.ui.theme.InstagramProfileCard
import com.commcode.learningcompose.ui.theme.LearningComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningComposeTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background)
                ) {
                    Preview()
                }
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
Scaffold(
    topBar = {
        TopAppBar(title = {
            Text(text = "TopAppBar title")
        },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Rounded.Menu,
                        contentDescription = null
                    )
                }
            })
    },
    drawerContent = {
        Text(text = "1")
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "2")
    },
    bottomBar = {
        BottomNavigation() {
            BottomNavigationItem(
                icon = {
                    Icon(
                        Icons.Rounded.Lock,
                        contentDescription = null
                    )
                },
                label = { Text(text = "Locked") },
                selected = true,
                onClick = { /*TODO*/ }
            )
        }
    }
) {
    Text(
        modifier = Modifier.padding(it),
        text = "Scaffold content"
    )
}
}

