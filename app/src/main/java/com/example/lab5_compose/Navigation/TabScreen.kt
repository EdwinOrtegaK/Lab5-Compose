package com.example.lab5_compose.Navigation

sealed class TabScreen(val route: String, val title: String){
    object MainActivity: TabScreen("main", "Inicio")
    object LocationScreen: TabScreen("favoritos", "Favoritos")
    object ProfileScreen: TabScreen("profile", "Perfil")
}
