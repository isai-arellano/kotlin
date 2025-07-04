package org.example.project.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

val LightColorTheme = lightColorScheme(
    primary = Primary,
    surface = Surface,
    surfaceContainerLowest = SurfaceLowest,
    background = Background,
    onSurface = OnSurface,
    onSurfaceVariant = OnSurfaceVariant,
)

val DarkColorTheme = lightColorScheme(
    primary = PrimaryDark,
    surface = SurfaceDark,
    surfaceContainerLowest = SurfaceLowestDark,
    background = BackgroundDark,
    onSurface = OnSurfaceDark,
    onSurfaceVariant = OnSurfaceVariantDark,
)

@Composable
fun KMPTheme(
    content: @Composable () -> Unit
) {
    // Asignar un tema dark
    val theme = if (isSystemInDarkTheme()) DarkColorTheme else LightColorTheme

  MaterialTheme(
      colorScheme = theme,
      typography = Typography,
      content = content
  )
}