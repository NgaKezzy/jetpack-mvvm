package com.example.mvvm

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.features.home.DetailScreen
import com.example.mvvm.features.home.HomeScreen
import com.example.mvvm.features.home.HomeViewModel

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home-screen")
    object DetailScreen : Screen("detail-screen")
}

@SuppressLint("UnrememberedGetBackStackEntry")
@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {

        composable(Screen.HomeScreen.route) {
            HomeScreen(navController, hiltViewModel())
        }

        composable(Screen.DetailScreen.route) {
            val parentEntry = remember {
                navController.getBackStackEntry(Screen.HomeScreen.route)
            }
            val homeViewModel = hiltViewModel<HomeViewModel>(parentEntry)
            DetailScreen(navController, hiltViewModel(),homeViewModel)
        }

    }
}