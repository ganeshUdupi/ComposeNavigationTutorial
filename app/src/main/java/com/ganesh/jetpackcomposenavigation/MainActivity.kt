package com.ganesh.jetpackcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.ganesh.jetpackcomposenavigation.ui.theme.JetPackComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}


@Composable
fun App() {

    val navController = rememberNavController()
    NavHost(
        navController = navController, startDestination = "registration"
    ) {

        composable(route = "registration") {
            RegistrationScreen() {
                navController.navigate("main")
            }
        }
        composable(route = "login") {
            LoginScreen()
        }

        composable(route = "main") {
            MainScreen() {
                navController.navigate("login")
            }
        }

    }
}

@Composable
fun RegistrationScreen(onClick: () -> Unit) {
    Text(text = "Registration",
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier.clickable {
            onClick()
        })

}

@Composable
fun LoginScreen() {
    Text(text = "Login", style = MaterialTheme.typography.headlineLarge)

}

@Composable
fun MainScreen(onClick: () -> Unit) {
    Text(text = "Main",
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier.clickable {
            onClick()
        })

}