package com.example.mvvm.features.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.mvvm.features.home.DetailViewModel

@Composable
fun DetailScreen(navController: NavController, viewModel: DetailViewModel = hiltViewModel(), homeViewModel: HomeViewModel) {

    Column() {
        Text("${homeViewModel.name.value}")
          TextButton(
        onClick = {
            navController.popBackStack()
        }
    ) {
        Text("Back ")
    }
    }

}