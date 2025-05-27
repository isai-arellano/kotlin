package com.isai_arellano.navigationkmp.navigationkmp.botton_bar

import androidx.compose.foundation.background
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.TabDisposable
import cafe.adriel.voyager.navigator.tab.TabNavigator

/**
* CreatedBy: Isaí
* 27/05/25
*/

class BottomBarScreen: Screen {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        TabNavigator(
            HomeTab,
            tabDisposable = {
                TabDisposable(
                    it,
                    listOf(HomeTab, FavoriteTab, ProfileTab)
                )
            }
        ){
            Scaffold (
                topBar = {
                    TopAppBar(title = { Text(it.current.options.title) })
                },
                bottomBar = {
                    BottomAppBar {
                        val tabNavigator: TabNavigator = LocalTabNavigator.current
                        NavigationBarItem(
                            selected = tabNavigator.current.key == HomeTab.key,
                            label = { Text(HomeTab.options.title)},
                            icon = { Icon(painter = HomeTab.options.icon!!, contentDescription = null) },
                            onClick = { tabNavigator.current = HomeTab}
                        )
                        NavigationBarItem(
                            selected = tabNavigator.current.key == FavoriteTab.key,
                            label = { Text(FavoriteTab.options.title)},
                            icon = { Icon(painter = FavoriteTab.options.icon!!, contentDescription = null) },
                            onClick = { tabNavigator.current = FavoriteTab}
                        )
                        NavigationBarItem(
                            selected = tabNavigator.current.key == ProfileTab.key,
                            label = { Text(ProfileTab.options.title)},
                            icon = { Icon(painter = ProfileTab.options.icon!!, contentDescription = null) },
                            onClick = { tabNavigator.current = ProfileTab}
                        )

                    }
                },
                content = { CurrentTab() }
            )
        }
    }

}