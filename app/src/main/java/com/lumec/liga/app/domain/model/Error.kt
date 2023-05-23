package com.lumec.liga.app.domain.model

sealed interface Error {
    object Server : Error
    object Connectivity : Error
    object Unknown : Error
}