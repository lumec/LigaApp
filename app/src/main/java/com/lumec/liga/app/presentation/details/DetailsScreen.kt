package com.lumec.liga.app.presentation.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.lumec.liga.app.domain.model.Team
import com.lumec.liga.app.presentation.details.components.JersySection
import com.lumec.liga.app.presentation.details.components.SocialNetworksSection
import com.lumec.liga.app.presentation.details.components.TeamSection

@Composable
fun DetailsScreen(navController: NavController) {
    val team = navController.previousBackStackEntry?.savedStateHandle?.get<Team>("team")
    team?.let {
        ScreenContainer(navController, team)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenContainer(navController: NavController, team: Team) {
    Scaffold(
        modifier = Modifier.padding(16.dp),
        topBar = {
            TopBar(
                navController = navController,
                team = team
            )
        },
        content = Content(team = team)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(navController: NavController, team: Team) {
    TopAppBar(
        title = {
            Text(team.name)
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    navController.navigateUp()
                }) {
                Icon(Icons.Rounded.ArrowBack, "Arrow Icon")
            }
        },
    )
}

@Composable
fun Content(team: Team): @Composable (PaddingValues) -> Unit = { innerPadding ->
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
    ) {
        TeamSection(team = team)
        JersySection(imagePath = team.jersey)
        Text(
            text = team.description,
            style = MaterialTheme.typography.titleMedium
        )
        SocialNetworksSection(team)
    }
}