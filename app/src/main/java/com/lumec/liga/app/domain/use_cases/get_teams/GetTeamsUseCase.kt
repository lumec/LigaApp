package com.lumec.liga.app.domain.use_cases.get_teams

import com.lumec.liga.app.common.Resource
import com.lumec.liga.app.domain.model.Team
import com.lumec.liga.app.domain.repository.TeamRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTeamsUseCase @Inject constructor(
    private val repository: TeamRepository
) {
    suspend operator fun invoke(): Flow<Resource<List<Team>>> = repository.getTeams()
}