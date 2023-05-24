package com.lumec.liga.app.presentation.home.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.lumec.liga.app.presentation.home.HomeState
import com.lumec.liga.app.presentation.navigation.Screen

@Composable
fun TeamList(
    modifier: Modifier,
    state: HomeState,
    navController: NavController
) {
    LazyColumn(modifier) {
        items(state.teams) { team ->
            TeamCard(
                team = team,
                onItemClick = { details->
                    navController.apply {
                        currentBackStackEntry?.savedStateHandle?.set(
                            key = "team",
                            value = details
                        )
                        navigate(Screen.Details.route)
                    }
                }
            )
        }
    }
}