package com.isai_arellano.navigationkmp.navigationkmp.botton_bar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions


/**
 * CreatedBy: Isaí
 * 27/05/25
 */

object HomeTab: Tab {

    override val options: TabOptions
        @Composable
        get(){
            val icon: VectorPainter = rememberVectorPainter(Icons.Default.Home)
            return remember {
                TabOptions(
                    index = 0u,
                    title = "Home",
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        Box(
            Modifier.fillMaxSize().background(Color.Green), contentAlignment = Alignment.Center
        ){
            Text("HomeScreen", fontSize = 22.sp, color = Color.Black)
        }
    }

}