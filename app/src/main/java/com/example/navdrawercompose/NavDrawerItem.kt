package com.example.navdrawercompose

import android.icu.text.CaseMap

sealed class NavDrawerItem(var route: String, var icon: Int, var title: String){
    object Home: NavDrawerItem("home", R.drawable.ic_home, "Home")
    object Music: NavDrawerItem("music", R.drawable.ic_music, "Music")
    object Movies: NavDrawerItem("movies", R.drawable.ic_movies, "Movies")
    object Books: NavDrawerItem("books", R.drawable.ic_books, "Books")
    object Profile: NavDrawerItem("profile", R.drawable.ic_profile, "Profile")
    object Settings: NavDrawerItem("settings", R.drawable.ic_settings, "Settings")
}
