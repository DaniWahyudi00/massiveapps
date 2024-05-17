package com.example.massiveapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.massiveapp.navigation.Screen
import com.example.massiveapp.screens.component.BottomNavigation
import com.example.massiveapp.screens.home.HomeScreen
import com.example.massiveapp.ui.theme.MassiveappTheme

@Composable
fun BuilderHomeApp(
    navController: NavHostController = rememberNavController(),
) {
    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Screen.Home.route) {
                HomeScreen()
            }
        }
    }
}

@Preview
@Composable
private fun BuilderHomeAppPreview() {
    MassiveappTheme {
        BuilderHomeApp()
    }
}