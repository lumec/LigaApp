package com.lumec.liga.app.data.remote

import com.lumec.liga.app.common.Constants.GET_TEAMS
import com.lumec.liga.app.common.Constants.LEAGUE
import retrofit2.http.GET
import retrofit2.http.Query

interface LeagueApi {
    @GET(GET_TEAMS)
    suspend fun getTeams(
        @Query("l") league: String = LEAGUE
    ): TeamsResponse
}