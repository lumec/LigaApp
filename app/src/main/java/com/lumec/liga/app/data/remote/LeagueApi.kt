package com.lumec.liga.app.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface LeagueApi {
    @GET("/search_all_teams.php")
    suspend fun getTeams(
        @Query("l") league: String
    ): List<TeamResponse>
}