package com.lumec.liga.app.data.remote

import com.google.gson.annotations.SerializedName

data class TeamsResponse(
    val teams: List<TeamResponse>?
)
data class TeamResponse(
    @SerializedName("strTeam")
    val name: String?,
    @SerializedName("strDescriptionEN")
    val description: String?,
    @SerializedName("intFormedYear")
    val year: Int?,
    @SerializedName("strStadium")
    val stadium: String?,
    @SerializedName("strTeamBadge")
    val badge: String?,
    @SerializedName("strTeamJersey")
    val jersey: String?,
    @SerializedName("strFacebook")
    val facebook: String?,
    @SerializedName("strInstagram")
    val instagram: String?,
    @SerializedName("strWebsite")
    val website: String?,
    @SerializedName("strTwitter")
    val twitter: String?,
    @SerializedName("strYoutube")
    val youtube: String?,
)