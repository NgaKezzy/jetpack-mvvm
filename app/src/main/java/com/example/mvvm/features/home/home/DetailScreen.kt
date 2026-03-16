package com.example.mvvm.features.home.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.mvvm.features.home.home.DetailViewModel

@Composable
fun DetailScreen(navController: NavController,hiltViewModel: DetailViewModel = hiltViewModel()) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().background(color = Color.Blue))
}