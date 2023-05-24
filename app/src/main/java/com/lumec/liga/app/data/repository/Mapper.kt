package com.lumec.liga.app.data.repository

import com.lumec.liga.app.data.remote.TeamResponse
import com.lumec.liga.app.domain.model.Team

fun TeamResponse.toDomainModel(): Team {
    return Team(
        name = name ?: "",
        description = description ?: "",
        year = year ?: "",
        stadium = stadium ?: "",
        badge = badge ?: "",
        jersey = jersey ?: "",
        facebook = facebook ?: "",
        instagram = instagram ?: "",
        website = website ?: "",
        twitter = twitter ?: "",
        youtube = youtube ?: "",
    )
}

fun List<TeamResponse>.toDomainModel(): List<Team> =
    map { it.toDomainModel() }