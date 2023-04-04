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
                    ComposeMaterial()
                }
            }
        }
    }
}

@Preview
@Composable
fun ComposeMaterial() {
//    Example()
//    Example2()
    Example3()
}

@Composable
private fun Example() {
    OutlinedButton(onClick = { /*TODO*/ }) {
        Text(text = "Button")
    }
}

@Composable
private fun Example2() {
    TextField(value = "Text",
        onValueChange = {},
        label = { Text(text = "Label") })
}

@Composable
private fun Example3() {
    AlertDialog(onDismissRequest = { /*TODO*/ },
        title = {
            Text(text = "Are you sure?")
        },
        text = {
            Text(text = "Do you really want to delete this file?")
        },
        confirmButton = {
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Yes")
            }
        },
        dismissButton = {
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "No")
            }
        })
}

