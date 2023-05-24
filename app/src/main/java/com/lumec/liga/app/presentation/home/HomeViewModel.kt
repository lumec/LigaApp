package com.lumec.liga.app.presentation.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lumec.liga.app.common.Resource
import com.lumec.liga.app.domain.use_cases.get_teams.GetTeamsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getTeamsUseCase: GetTeamsUseCase
) : ViewModel() {

    private val _state = mutableStateOf(HomeState())
    val state: State<HomeState> = _state

    init {
        getTeams()
    }

    private fun getTeams() {
        viewModelScope.launch {
            getTeamsUseCase().collect{ result ->
                when(result) {
                    is Resource.Error -> {
                        _state.value = HomeState(error = result.message ?: "Message")
                    }
                    is Resource.Loading -> {
                        _state.value = HomeState(isLoading = true)
                    }
                    is Resource.Success -> {
                        _state.value = HomeState(teams = result.data ?: emptyList())
                    }
                }
            }
        }
    }

}


