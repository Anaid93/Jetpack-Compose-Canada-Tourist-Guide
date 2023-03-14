package com.example.touristguidecanada.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.touristguidecanada.screens.FirstScreen
import com.example.touristguidecanada.screens.SecondScreen
import com.example.touristguidecanada.screens.ThirdScreen
import com.example.touristguidecanada.screens.FourthScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route){
        composable(route = AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }
        composable(route = AppScreens.ThirdScreen.route){
            ThirdScreen(navController)
        }
        composable(route = AppScreens.FourthScreen.route){
            FourthScreen(navController)
        }

    }
}