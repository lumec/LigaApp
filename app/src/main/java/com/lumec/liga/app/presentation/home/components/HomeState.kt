package com.lumec.liga.app.presentation.home.components

import com.lumec.liga.app.domain.model.Team

data class HomeState(
    val isLoading: Boolean = false,
    val teams: List<Team> = emptyList(),
    val error: String = ""
)