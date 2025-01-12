package com.example.pokebuddy

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginActivity(){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        var email by rememberSaveable() {mutableStateOf("") }
        var password by rememberSaveable() {mutableStateOf("") }

        OutlinedTextField(
            value = "Enter Your Email",
            onValueChange = {email = it},
            label = {Text("Email")}
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = "Enter Your Password",
            onValueChange = {password = it},
            label = {Text("Password")}
        )

        Button(
            onClick = {}
        ) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {}
        ) {
            Text(text = "Login")
        }


    }
}
