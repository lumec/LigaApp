package com.lumec.liga.app.domain.mapper

interface Mapper<T> {
    fun toDomainModel(): T
}