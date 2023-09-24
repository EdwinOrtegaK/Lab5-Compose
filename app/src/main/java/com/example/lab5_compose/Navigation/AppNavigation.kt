package com.example.lab5_compose.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab5_compose.locationScreeen
import com.example.lab5_compose.mainScreen
import com.example.lab5_compose.profileScreeen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = TabScreen.MainActivity.route){
        composable(route = TabScreen.MainActivity.route){
            mainScreen(navController)
        }
        composable(route = TabScreen.LocationScreen.route){
            locationScreeen(navController)
        }
        composable(route = TabScreen.ProfileScreen.route){
            profileScreeen(navController)
        }
    }
}