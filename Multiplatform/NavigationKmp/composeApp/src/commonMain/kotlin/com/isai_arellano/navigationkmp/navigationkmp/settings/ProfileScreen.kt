package com.isai_arellano.navigationkmp.navigationkmp.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.russhwolf.settings.Settings

class ProfileScreen: Screen {
    private val settings = Settings()
    companion object {
        const val KEY_NAME = "name"
        const val KEY_IS_VIP = "isVip"
    }

    @Composable
    override fun Content() {
        val navigator: Navigator = LocalNavigator.currentOrThrow
        var name by remember { mutableStateOf("") }
        var isVip by remember { mutableStateOf(false) }

        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(Modifier.weight(1f))
            OutlinedTextField(value = name, onValueChange = { name = it })
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = isVip, onCheckedChange = { isVip = it })
                Text("¿Es VIP?")
            }
            Spacer(Modifier.weight(1f))
            Button(onClick = {
                settings.putString(KEY_NAME, name)
                settings.putBoolean(KEY_IS_VIP, isVip)
                navigator.push(ProfileResultScreen())
            }, enabled = name.isNotEmpty()) {
                Text("Guardar perfil")
            }
            Spacer(Modifier.weight(0.3f))
        }
    }
}