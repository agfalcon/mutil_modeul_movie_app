package the.end2024.movieapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import the.end2024.movieapp.R

private val spoqaThin = FontFamily(
    Font(R.font.spoqa_han_sans_neo_thin, FontWeight.Thin)
)
private val spoqaRegular = FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal)
)
private val spoqaBold = FontFamily(
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)

val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 60.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 32.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 24.sp
    ),
    titleLarge = TextStyle(
        fontFamily = spoqaThin,
        fontSize = 32.sp
    ),
    titleMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp
    ),
    titleSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp
    ),
    displayLarge = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 18.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 15.sp
    ),
    bodySmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    )
)