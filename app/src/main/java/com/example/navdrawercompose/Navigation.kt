package com.example.navdrawercompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navdrawercompose.screens.*

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavDrawerItem.Home.route) {
        composable(NavDrawerItem.Home.route) {
            HomeScreen()
        }
        composable(NavDrawerItem.Movies.route) {
            MoviesScreen()
        }
        composable(NavDrawerItem.Profile.route) {
            ProfileScreen()
        }
        composable(NavDrawerItem.Settings.route) {
            SettingsScreen()
        }
        composable(NavDrawerItem.Books.route) {
            BooksScreen()
        }
        composable(NavDrawerItem.Music.route) {
            MusicScreen()
        }
    }
}