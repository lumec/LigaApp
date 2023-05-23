package com.lumec.liga.app.domain.repository

import com.lumec.liga.app.common.Resource
import com.lumec.liga.app.domain.model.Team
import kotlinx.coroutines.flow.Flow

interface TeamRepository {
    suspend fun getTeams(): Flow<Resource<List<Team>>>
}