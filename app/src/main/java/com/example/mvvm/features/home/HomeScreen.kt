package com.example.mvvm.features.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.mvvm.Screen
import com.example.mvvm.features.home.HomeViewModel

@Composable
fun HomeScreen(navController: NavHostController, viewModel: HomeViewModel = hiltViewModel()) {
    val _user = viewModel.user.collectAsState()
    Column() {
      Text("Counter = ${_user.value.name}")


        Button(
            onClick = {
                println("Button clicked")
                viewModel.increment()
                viewModel.changedName()
                navController.navigate(Screen.DetailScreen.route)


            }
        ) {
            Text("Click me")
        }
    }
}