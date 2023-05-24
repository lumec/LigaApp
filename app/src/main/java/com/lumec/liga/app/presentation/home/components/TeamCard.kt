package com.lumec.liga.app.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.lumec.liga.app.domain.model.Team

@Composable
fun TeamCard(team: Team) {
    Card(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth()
            .height(80.dp),
        shape = RoundedCornerShape(corner = CornerSize(8.dp)),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Picture(imagePath = team.badge)
            Content(team = team)
        }
    }
}


@Composable
fun Picture(imagePath: String) {
    Box(
        modifier = Modifier
        .clip(RoundedCornerShape(corner = CornerSize(8.dp)))
    ) {
        SubcomposeAsyncImage(
            model = imagePath,
            contentDescription = "Product Image",
            loading = {
                CircularProgressIndicator()
            },
            modifier = Modifier
                .background(Color.White)
                .width(50.dp)
                .height(50.dp),
        )
    }

}

@Composable
fun Content(team: Team) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .padding(start = 8.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = team.name,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.titleLarge
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Filled.LocationOn,
                contentDescription = "Location Icon",
                tint = Color.Red,
            )
            Text(
                text = team.stadium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.labelMedium
            )
        }

    }
}