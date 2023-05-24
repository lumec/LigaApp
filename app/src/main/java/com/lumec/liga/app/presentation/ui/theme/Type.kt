package com.lumec.liga.app.presentation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.lumec.liga.app.R

val fonts = FontFamily(
    Font(R.font.nunito_regular),
    Font(R.font.nunito_bold, weight = FontWeight.Bold),
    Font(R.font.nunito_light, weight = FontWeight.Light),
    Font(R.font.nunito_extralight, weight = FontWeight.Thin),
    Font(R.font.nunito_italic, weight = FontWeight.Normal, style = FontStyle.Italic)
)

val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        fontSize = 24.sp,
        shadow = Shadow(
            Color.Black, Offset(1f,2f), 4f
        )
    ),
    titleMedium = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = fonts,
        fontStyle = FontStyle.Italic,
        fontSize = 16.sp
    ),
    labelMedium = TextStyle(
        fontFamily = fonts,
        fontStyle = FontStyle.Normal,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp
    )
)