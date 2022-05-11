package com.example.navdrawercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.navdrawercompose.ui.theme.NavDrawerComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(initialValue = DrawerValue.Closed))
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopBar(scope = scope, scaffoldState = scaffoldState)},
        drawerBackgroundColor = colorResource(id = R.color.purple_200),
        drawerContent = {
            Drawer(scope = scope, scaffoldState = scaffoldState, navController = navController )
        },
    ) {
        Navigation(navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NavDrawerComposeTheme {
        MainScreen()
    }
}