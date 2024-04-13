package the.end2024.movieapp.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import the.end2024.movieapp.ui.theme.colors.MovieColorSet
import the.end2024.movieapp.ui.theme.colors.MovieColors


private val MovieLocalColor = staticCompositionLocalOf { MovieColorSet.RedTheme.LightColors }

@Composable
fun MovieAppTheme(
    movieColorSet: MovieColorSet = MovieColorSet.RedTheme,
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors =
        if (darkTheme) {
            movieColorSet.DarkColors
        } else {
            movieColorSet.LightColors
        }


    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colors.material.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    CompositionLocalProvider(MovieLocalColor provides colors) {
        MaterialTheme(
            colorScheme = colors.material,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}

val MaterialTheme.colors: MovieColors
    @Composable
    @ReadOnlyComposable
    get() = MovieLocalColor.current