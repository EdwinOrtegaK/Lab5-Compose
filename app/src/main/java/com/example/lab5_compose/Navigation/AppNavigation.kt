package com.example.lab5_compose.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab5_compose.LocationScreen
import com.example.lab5_compose.MainActivity
import com.example.lab5_compose.ProfileScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = TabScreen.MainActivity.route){
        composable(route = TabScreen.MainActivity.route){
            MainActivity()
        }
        composable(route = TabScreen.LocationScreen.route){
            LocationScreen()
        }
        composable(route = TabScreen.ProfileScreen.route){
            ProfileScreen()
        }
    }
}