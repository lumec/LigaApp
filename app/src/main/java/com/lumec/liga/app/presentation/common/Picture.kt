package com.lumec.liga.app.presentation.common

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.SubcomposeAsyncImage

@Composable
fun Picture(
    imagePath: String,
    contentDescription: String,
    modifier: Modifier
) {
    SubcomposeAsyncImage(
        model = imagePath,
        contentDescription = contentDescription,
        loading = {
            CircularProgressIndicator()
        },
        modifier = modifier
    )
}