package com.lumec.liga.app.presentation.details

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.lumec.liga.app.domain.model.Team
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
): ViewModel() {

    init {
        Log.e("LogDetails", "ViewModel")

        savedStateHandle.get<Team>("team")?.let{ teamDetails ->
            Log.e("LogDetails", teamDetails.jersey)
        }
    }
}