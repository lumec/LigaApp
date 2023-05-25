package com.lumec.liga.app.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    val name: String,
    val description: String,
    val year: String,
    val stadium: String,
    val badge: String,
    val jersey: String,
    val facebook: String,
    val instagram: String,
    val website: String,
    val twitter: String,
    val youtube: String,
): Parcelable