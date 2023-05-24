package com.lumec.liga.app.presentation.details

import com.lumec.liga.app.domain.model.Team

data class DetailsState(
    val isLoading: Boolean = false,
    val team: Team? = null,
    val error: String = ""
)