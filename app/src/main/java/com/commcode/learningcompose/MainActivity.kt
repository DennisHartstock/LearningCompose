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
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        setContent {
            PreviewTest(viewModel)
        }
    }
}

@Composable
private fun PreviewTest(viewModel: MainViewModel) {
LearningComposeTheme {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            ) {
                val models = viewModel.models.observeAsState(listOf())
                LazyRow {
                    items(models.value) {model ->
                        InstagramProfileCard(
                            model = model,
                            onFollowedButtonClickListener = {
                                viewmodel.changeFollowingStatus(it)
                            }
                        )
                    }
                }
        }
     }
}

@Preview
@Composable
private fun Preview() {

    val snackbarHostState = remember {
        SnackbarHostState()
    }
    Log.d("Preview", snackbarHostState.currentSnackbarData.toString)
    val scope = rememberCoroutineScope()
    val fabIsVisible = remember {
        mutableStateOf(true)
    }

Scaffold(
    snackbarHost = {
        SnackbarHost(hostState = snackbarHostState)
    },
    floatingActionButton = {
        if (fabIsVisible.value) {
            FloatingActionButton(onClick = {
                scope.launch {
                    val action = snackbarHostState.showSnackbar(
                        message = "This is snackbar",
                        actionLabel = "Hide Fab",
                        duration = SnackbarDuration.Long
                    )
                    if (action == SnackbarResult.ActionPerformed) {
                        fabIsVisible.value = false
                    }
                }
            }) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = null
                )
            }
        }
    },
    topBar = {
        TopAppBar(title = {
            Text(text = "TopAppBar title")
        },
            navigationIcon = {
                IconButton(onClick = {}) {
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
                onClick = {}
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

