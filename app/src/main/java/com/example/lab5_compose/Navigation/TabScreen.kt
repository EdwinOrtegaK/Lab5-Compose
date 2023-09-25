package com.example.lab5_compose.Navigation

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

sealed class TabScreen(val route: String, val title: String){
    object MainScreen: TabScreen("main", "Inicio")
    object LocationScreen: TabScreen("locasiones", "Favoritos")
    object DetaileScreen: TabScreen("detalles", "Detalles")
    object ProfileScreen: TabScreen("profile", "Perfil")
    object FavoriteScreen: TabScreen("favoritos", "Perfil")
}
