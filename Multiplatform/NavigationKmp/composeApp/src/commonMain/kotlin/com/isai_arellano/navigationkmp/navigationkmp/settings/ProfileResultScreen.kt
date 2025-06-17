package com.isai_arellano.navigationkmp.navigationkmp.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.russhwolf.settings.Settings

class ProfileResultScreen: Screen{
    private val settings: Settings = Settings()

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val isVip = settings.getBoolean(ProfileScreen.KEY_IS_VIP, false)
        val backgroundColor : Color = if (isVip) Color.Yellow else Color.Green

        Column(modifier = Modifier.fillMaxSize().background(backgroundColor), horizontalAlignment = Alignment.CenterHorizontally) {
            val name = settings.getString(ProfileScreen.KEY_NAME, "Desconocido")
            Text("Bienvenido $name", fontSize = 26.sp, fontWeight = FontWeight.Bold)
            Button(onClick = {
                settings.remove(ProfileScreen.KEY_NAME)
                settings.remove(ProfileScreen.KEY_IS_VIP)
                navigator.pop()
            }) {
                Text("Volver")
            }
        }

    }
}