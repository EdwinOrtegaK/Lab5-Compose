package com.example.lab5_compose.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab5_compose.Screens.detailScreen
import com.example.lab5_compose.Screens.favoriteContent
import com.example.lab5_compose.Screens.favoriteScreeen
import com.example.lab5_compose.Screens.locationScreeen
import com.example.lab5_compose.Screens.mainScreen1
import com.example.lab5_compose.Screens.profileScreeen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = TabScreen.MainScreen.route){
        composable(route = TabScreen.MainScreen.route){
            mainScreen1(navController)
        }
        composable(route = TabScreen.LocationScreen.route){
            locationScreeen(navController)
        }
        composable(route = TabScreen.DetaileScreen.route){
            detailScreen(navController)
        }
        composable(route = TabScreen.ProfileScreen.route){
            profileScreeen(navController)
        }
        composable(route = TabScreen.FavoriteScreen.route){
            favoriteScreeen(navController)
        }
    }
}