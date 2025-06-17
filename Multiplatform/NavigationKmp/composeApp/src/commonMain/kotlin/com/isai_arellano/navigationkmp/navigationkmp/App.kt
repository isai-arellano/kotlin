package com.isai_arellano.navigationkmp.navigationkmp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import cafe.adriel.voyager.transitions.FadeTransition
import cafe.adriel.voyager.transitions.ScaleTransition
import cafe.adriel.voyager.transitions.SlideTransition
import com.isai_arellano.navigationkmp.navigationkmp.botton_bar.BottomBarScreen
import com.isai_arellano.navigationkmp.navigationkmp.settings.ProfileScreen
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import navigationkmp.composeapp.generated.resources.Res
import navigationkmp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
       Navigator(MainScreen()){ navigator ->
           //SlideTransition(navigator)
           FadeTransition(navigator)
           //ScaleTransition(navigator)
       }
    }
}

class MainScreen: Screen {
    @Composable
    override fun Content(){
        val navigator = LocalNavigator.currentOrThrow
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = {navigator.push(SecondScreen())}) {
                Text("Basic navigation")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {navigator.push(BottomBarScreen())}) {
                Text("Bottonbar navigation")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {navigator.push(ProfileScreen())}) {
                Text("Navegación con persistencia de datos")
            }
        }
    }
}

class SecondScreen: Screen {
    @Composable
    override fun Content(){
        val navigator = LocalNavigator.currentOrThrow
        Column (modifier = Modifier.fillMaxSize().background(Color.DarkGray),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text("Second Screen", fontSize = 26.sp, color = Color.White)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                navigator.pop()
            }){
                Text("Go back")
            }
        }
    }
}

