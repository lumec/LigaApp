package com.lumec.liga.app.presentation.details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.lumec.liga.app.domain.model.Team
import com.lumec.liga.app.presentation.common.Picture

@Composable
fun TeamSection(
    team: Team,
    onItemClick: (Team) -> Unit,
) {
    Card(
        modifier = Modifier
            .clickable { onItemClick(team) }
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(8.dp)),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            BadgeImage(imagePath = team.badge)
            Content(team = team)
        }
    }
}


@Composable
fun BadgeImage(imagePath: String) {
    Box(
        modifier = Modifier
        .clip(RoundedCornerShape(corner = CornerSize(8.dp)))
    ) {
        Picture(
            imagePath = imagePath,
            contentDescription = "Badge Image",
            modifier = Modifier
                .background(Color.White)
                .fillMaxHeight()
                .width(120.dp),
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
        Row {
            Icon(
                imageVector = Icons.Filled.DateRange,
                contentDescription = "Year Icon",
                tint = Color.Red,
            )
            Text(
                text = "Founded in ${team.year}",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}