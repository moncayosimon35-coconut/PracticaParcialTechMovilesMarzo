package com.example.practicaparaparcial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practicaparaparcial.ui.screens.Screen1
import com.example.practicaparaparcial.ui.screens.Screen2
import com.example.practicaparaparcial.ui.theme.PracticaParaParcialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Navegacion()
        }
    }
}

@Composable
fun Navegacion() {
    val navController = rememberNavController()

    //creacion del navcontroler para la navegacion
    NavHost(navController = navController, startDestination = "login") {
        //se define la ruta de login
        composable("login"){
            Screen1(
                onLoginSucess = {navController.navigate("perfil")}
            )
            }
        //defio la ruta de perfil
        composable("perfil"){
            Screen2()
        }
        }
    }
