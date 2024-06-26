package com.example.massiveapp.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.massiveapp.ui.theme.MassiveappTheme
import com.example.massiveapp.ui.theme.poppinsFontFamily

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Home Screen")
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    MassiveappTheme {
        HomeScreen()
    }
}