package com.lumec.liga.app.data.repository

import com.lumec.liga.app.domain.mapper.Mapper
import com.lumec.liga.app.domain.model.Team

data class TeamDto(
    val name: String?,
    val description: String?,
    val year: Int?,
    val stadium: String?,
    val badge: String?,
    val jersey: String?,
    val facebook: String?,
    val instagram: String?,
    val website: String?,
    val twitter: String?,
    val youtube: String?,
) : Mapper<Team> {
    override fun toDomainModel(): Team {
       return Team(
           name = name ?: "",
           description = description ?: "",
           year = year ?: 0,
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
}