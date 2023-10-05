package com.loc.newsapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.loc.newsapp.R

val Airbnb = FontFamily(
    fonts = listOf(
        Font(R.font.airbnb_cereal_app_book, FontWeight.Normal),
        Font(R.font.airbnb_cereal_app_bold, FontWeight.Bold),
        Font(R.font.airbnb_cereal_app_medium, FontWeight.SemiBold),
    )
)

// Set of Material typography styles to start with
// body is "Text" in the Figma Design
// label small is xsmall in Figma Design
val Typography = Typography(
    titleMedium = TextStyle(
        fontSize = 35.sp,
        fontFamily = Airbnb,
        fontWeight = FontWeight.SemiBold
    ),
    headlineMedium = TextStyle(
        fontSize = 24.sp,
        fontFamily = Airbnb,
        fontWeight = FontWeight.SemiBold
    ),
    bodySmall = TextStyle(
        fontSize = 14.sp,
        fontFamily = Airbnb,
        fontWeight = FontWeight.Normal
    ),

    bodyMedium = TextStyle(
        fontSize = 16.sp,
        fontFamily = Airbnb,
        fontWeight = FontWeight.Medium
    )

    /*  displaySmall = TextStyle(
          fontSize = 24.sp,
          fontFamily = Poppins,
          fontWeight = FontWeight.Normal,
          lineHeight = 36.sp,
      ),
      displayMedium = TextStyle(
          fontSize = 32.sp,
          fontFamily = Poppins,
          fontWeight = FontWeight.Normal,
          lineHeight = 48.sp,
      ),
      bodySmall = TextStyle(
          fontSize = 14.sp,
          fontFamily = Poppins,
          fontWeight = FontWeight.Normal,
          lineHeight = 21.sp,
      ),
      bodyMedium = TextStyle(
          fontSize = 16.sp,
          fontFamily = Poppins,
          fontWeight = FontWeight.Normal,
          lineHeight = 24.sp,
      ),
      labelSmall = TextStyle(
          fontSize = 13.sp,
          fontFamily = Poppins,
          fontWeight = FontWeight.Normal,
          lineHeight = 19.sp,
      ),*/
)