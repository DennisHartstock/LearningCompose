package com.commcode.learningcompose

//import com.commcode.learningcompose.ui.theme.InstagramProfileCard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.commcode.learningcompose.ui.screen.AnimateContent
import com.commcode.learningcompose.ui.theme.LearningComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        setContent {
            LearningComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AnimateContent()
//            Animation()
//            ActivityResultTest()
//            PreviewTest(viewModel)
                }
            }
        }
    }
}
//
//@Composable
//private fun PreviewTest(viewModel: MainViewModel) {
//LearningComposeTheme {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(MaterialTheme.colors.background)
//            ) {
//                val models = viewModel.models.observeAsState(listOf())
//                LazyColumn {
//                    items(models.value, keys = {it.id}) {model ->
//                        val dismissState = rememberDismissState()
//
//                        if(dismissState.isDismissed(DismissDirection.EndToStart)) {
//                            viewModel.delete(model)
//                        }
//
//                        SwipeToDismiss(
//                            state = dismissState,
//                            directions = listOf(DismissDirection.EndToStart),
//                            background = {
//                                Box(
//                                    modifier = Modifier
//                                    .padding(16.dp)
//                                    .fillMaxSize
//                                    .background = Color.Red.copy(alpha = 0.5f),
//                                    contentAlignment = Alignment.CenterEnd
//                                ) {
//                                    Text(
//                                        modifier = Modifier.padding(16.dp),
//                                        text = "Delete item",
//                                        color = Color.White,
//                                        fontSize = 24.sp
//                                    )
//                                }
//                             }
//                        ) {
//                            InstagramProfileCard(
//                            model = model,
//                            onFollowedButtonClickListener = {
//                                viewmodel.changeFollowingStatus(it)
//                            }
//                        )
//                        }
//                    }
//                }
//        }
//     }
//}
//
//@Preview
//@Composable
//private fun Preview() {
//
//    val snackbarHostState = remember {
//        SnackbarHostState()
//    }
//    Log.d("Preview", snackbarHostState.currentSnackbarData.toString)
//    val scope = rememberCoroutineScope()
//    val fabIsVisible = remember {
//        mutableStateOf(true)
//    }
//
//Scaffold(
//    snackbarHost = {
//        SnackbarHost(hostState = snackbarHostState)
//    },
//    floatingActionButton = {
//        if (fabIsVisible.value) {
//            FloatingActionButton(onClick = {
//                scope.launch {
//                    val action = snackbarHostState.showSnackbar(
//                        message = "This is snackbar",
//                        actionLabel = "Hide Fab",
//                        duration = SnackbarDuration.Long
//                    )
//                    if (action == SnackbarResult.ActionPerformed) {
//                        fabIsVisible.value = false
//                    }
//                }
//            }) {
//                Icon(
//                    imageVector = Icons.Filled.Add,
//                    contentDescription = null
//                )
//            }
//        }
//    },
//    topBar = {
//        TopAppBar(title = {
//            Text(text = "TopAppBar title")
//        },
//            navigationIcon = {
//                IconButton(onClick = {}) {
//                    Icon(
//                        Icons.Rounded.Menu,
//                        contentDescription = null
//                    )
//                }
//            })
//    },
//    drawerContent = {
//        Text(text = "1")
//        Spacer(modifier = Modifier.height(4.dp))
//        Text(text = "2")
//    },
//    bottomBar = {
//        BottomNavigation() {
//            BottomNavigationItem(
//                icon = {
//                    Icon(
//                        Icons.Rounded.Lock,
//                        contentDescription = null
//                    )
//                },
//                label = { Text(text = "Locked") },
//                selected = true,
//                onClick = {}
//            )
//        }
//    }
//) {
//    Text(
//        modifier = Modifier.padding(it),
//        text = "Scaffold content"
//    )
//}
//}
//
