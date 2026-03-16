package com.example.mvvm.features.home.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.mvvm.features.home.home.HomeViewModel

@Composable
fun HomeScreen(navController: NavHostController,hiltViewModel: HomeViewModel) {
    Text("Home Screen")
}