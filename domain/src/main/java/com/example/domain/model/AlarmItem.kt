package com.example.domain.model

interface AlarmItem {

    interface Mapper<I : Any, O : Any> {
        fun map(item: I): O
    }

    data class Success(
        val id: Int,
        val hours: Byte,
        val minutes: Byte,
        val days: List<Boolean>,
        val vibro: Boolean,
        val isActive: Boolean,
        val description: String
    ) : AlarmItem
}