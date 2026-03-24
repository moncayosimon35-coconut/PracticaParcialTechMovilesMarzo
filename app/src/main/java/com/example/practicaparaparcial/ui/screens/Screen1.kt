package com.example.practicaparaparcial.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Screen1(onLoginSucess:()-> Unit) {
    //estados para almacenar los valores en la cajas de
    var email by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }
    var textoEntrar by remember { mutableStateOf("") }

    //todo en una columna
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center //verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Bienvenido", fontSize = 25.sp)
        Text(text = "Inicia Sesión", fontSize = 25.sp)

        //campo vacio de emial
        //llama a la variable estado email
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("correo electronico") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        //ahora el de contraseña
        OutlinedTextField(
            value = contrasena,
            onValueChange = { contrasena = it },
            label = { Text("Contaseña") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        //ahora el boton que genera toda la accion
        Button(
            onClick = {
                if (email == "hola" && contrasena == "hola") {
                    onLoginSucess()
                } else {
                //error de inicio sesion
                }
            }) {
            Text("entrar")
        }

    }
}