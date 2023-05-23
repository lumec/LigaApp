package com.lumec.liga.app.data.repository

import com.lumec.liga.app.common.Resource
import com.lumec.liga.app.data.remote.LeagueApi
import com.lumec.liga.app.domain.model.Team
import com.lumec.liga.app.domain.repository.TeamRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class TeamRepositoryImpl @Inject constructor(
    private val api: LeagueApi
): TeamRepository {
    override suspend fun getTeams(): Flow<Resource<List<Team>>> = flow {
        try {
            emit(Resource.Loading())
            val teams = api.getTeams().teams?.toDomainModel()
            emit(Resource.Success(teams))
        } catch (e: HttpException) {
            emit(Resource.Error(message = "An expected error has occurred"))
        } catch (e: IOException) {
            emit(Resource.Error(message = "Check your internet connection"))
        }
    }
}
