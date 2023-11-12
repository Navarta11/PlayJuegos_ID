package com.example.playjuegos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.playjuegos.ui.theme.PlayJuegosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayJuegosTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "coverMain") {
                        composable("coverMain") {coverMain(navController)}
                        composable("Preferences") {Preferences(navController)}
                        composable("MenuNewPlayer") {MenuNewPlayer(navController)}
                    }
                //MenuNewPlayer()
                //Cover()
                //Actividades3()
                }
            }
        }
    }
}