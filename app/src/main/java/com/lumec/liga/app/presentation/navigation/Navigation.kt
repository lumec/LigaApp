package com.lumec.liga.app.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lumec.liga.app.presentation.details.DetailsScreen
import com.lumec.liga.app.presentation.home.HomeScreen
import com.lumec.liga.app.presentation.splash.SplashScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(
            route = Screen.Splash.route
        ) {
            SplashScreen(navController)
        }
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Details.route
        ) {
            DetailsScreen(navController)
        }
    }
}