package com.example.navdrawercompose

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopBar(scope: CoroutineScope, scaffoldState: ScaffoldState){
    TopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name), fontSize = 18.sp) },
        navigationIcon = {
            IconButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }) {
                Icon(Icons.Filled.Menu, "")
            }
        },
        backgroundColor = colorResource(id = R.color.purple_500),
        contentColor = Color.White
    )
}

@Preview(showBackground = false)
@Composable
fun TopBarPreview(){
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState()
    TopBar(scope = scope, scaffoldState = scaffoldState)
}