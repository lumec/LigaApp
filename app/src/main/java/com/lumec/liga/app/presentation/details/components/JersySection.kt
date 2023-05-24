package com.lumec.liga.app.presentation.details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.lumec.liga.app.presentation.common.Picture

@Composable
fun JersySection(imagePath: String) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(corner = CornerSize(8.dp)))
    ) {
        Picture(
            imagePath = imagePath,
            contentDescription = "Jersy Image",
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(300.dp),
        )
    }
}