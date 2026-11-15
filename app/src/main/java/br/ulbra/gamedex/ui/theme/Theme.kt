package br.ulbra.gamedex.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = Vermelho,
    secondary = VermelhoEscuro,
    tertiary = Vermelho,
    background = Preto,
    surface = Preto,
    onPrimary = Branco,
    onSecondary = Branco,
    onBackground = Branco,
    onSurface = Branco
)

private val LightColorScheme = lightColorScheme(
    primary = VermelhoEscuro,
    secondary = Vermelho,
    tertiary = VermelhoEscuro,
    background = CinzaClaro,
    surface = Branco,
    onPrimary = Branco,
    onSecondary = Branco,
    onBackground = Preto,
    onSurface = Preto
)

@Composable
fun GameDexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
