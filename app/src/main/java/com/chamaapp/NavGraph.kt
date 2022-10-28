package com.chamaapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController:NavHostController

){
    NavHost(navController = navController,
        startDestination = Screen.Greeting.route

        ){
        composable(
            route="greeting_screen"
        ){
            Screen.Greeting
        }
        composable(
            route=Screen.Contribute.route
        ){
            ContributeScreen()
        }

    }
}


