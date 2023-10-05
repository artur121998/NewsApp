package com.loc.newsapp.activity.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.loc.newsapp.ui.theme.blueAlpha
import com.loc.newsapp.ui.theme.blueAlpha20
import com.loc.newsapp.ui.theme.orangeAlpha20
import com.loc.newsapp.ui.theme.orangeAlpha80

@Composable
fun BackgroundForm() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White)
            .blur(radius = 40.dp, BlurredEdgeTreatment.Unbounded)
    ) {
        CircleSweepGradient(
            listOf(blueAlpha20, Color(0X209895EE), Color(0x20C55492)),
            174.0F,
            189.0F,
            Modifier.offset(-(54).dp, -(5).dp)
        )
        CircleSweepGradient(
            listOf(orangeAlpha20, blueAlpha20),
            209.0F,
            227.0F,
            Modifier
                .align(Alignment.TopEnd)
                .offset(50.dp, -(75).dp)
        )
        CircleSweepGradient(
            listOf(orangeAlpha20, blueAlpha20),
            209.0F,
            227.0F,
            Modifier
                .align(Alignment.CenterEnd)
                .offset(24.dp, 55.dp)
        )
        CircleSweepGradient(
            listOf(blueAlpha, orangeAlpha80),
            322.0F,
            349.0F,
            Modifier
                .align(Alignment.BottomEnd)
                .offset(305.dp, 25.dp)
        )
        CircleSweepGradient(
            listOf(blueAlpha, orangeAlpha80),
            174.0F,
            189.0F,
            Modifier
                .align(Alignment.BottomStart)
                .offset(-(107).dp, 106.dp)
        )
    }
}


@Composable
fun CircleSweepGradient(colors: List<Color>, width: Float, height: Float, modifier: Modifier) {
    // convert the box size to pixels
    val widthPx = with(LocalDensity.current) { width.dp.toPx() }
    val heightPx = with(LocalDensity.current) { height.dp.toPx() }
    val offset = Offset(
        x = widthPx / 2,
        y = heightPx / 2
    )
    Box(
        modifier = modifier
            .size(width = width.dp, height = height.dp)
            .rotate(90.0F)
            .background(
                brush = Brush.sweepGradient(
                    colors = colors,
                    center = offset
                ),
                shape = CircleShape
            )
    ) {
    }
}

@Preview
@Composable
fun BlurredCirclesBackgroundPreview() {
    BackgroundForm()
}