package com.example.massiveapp.screens.component

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.graphics.toColorInt
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.massiveapp.R
import com.example.massiveapp.navigation.NavigationItem
import com.example.massiveapp.navigation.Screen
import com.example.massiveapp.ui.theme.MassiveappTheme
import com.example.massiveapp.ui.theme.poppinsFontFamily

@Composable
fun BottomNavigation(
    navController: NavHostController
) {
    NavigationBar(
        containerColor = Color.White
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navigationItems = listOf(
            NavigationItem(
                title = "Home",
                icon = painterResource(R.drawable.icon_home_outlined),
                iconActive = painterResource(R.drawable.icon_home_filled),
                screen = Screen.Home
            ),
            NavigationItem(
                title = "Service",
                icon = painterResource(R.drawable.icon_elementplus_outlined),
                iconActive = painterResource(R.drawable.icon_elementplus_filled),
                screen = Screen.Service
            ),
            NavigationItem(
                title = "Transaction",
                icon = painterResource(R.drawable.icon_transactionminus_outlined),
                iconActive = painterResource(R.drawable.icon_transactionminus_filled),
                screen = Screen.Transaction
            ),
            NavigationItem(
                title = "Profile",
                icon = painterResource(R.drawable.icon_user_outlined),
                iconActive = painterResource(R.drawable.icon_user_filled),
                screen = Screen.Profile
            ),
        )
        navigationItems.map { item ->
            val isSelected = currentRoute == item.screen.route
            NavigationBarItem(
                selected = isSelected,
                onClick = {},
                icon = {
                    if (isSelected) {
                        Icon(
                            painter = item.iconActive,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.primary
                        )
                    } else {
                        Icon(
                            painter = item.icon,
                            contentDescription = item.title,
                        )
                    }
                },
                label = {
                    if (isSelected) {
                        Text(
                            text = item.title,
                            color = MaterialTheme.colorScheme.primary,
                            fontFamily = poppinsFontFamily
                        )
                    } else {
                        Text(
                            text = item.title,
                            fontFamily = poppinsFontFamily
                        )
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.White
                )
            )
        }
    }
}

@Preview
@Composable
private fun BottomNavigationPreview() {
    MassiveappTheme {
        BottomNavigation(navController = rememberNavController())
    }
}