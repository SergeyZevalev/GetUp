package com.example.core.presentation.alarmList

interface UiAlarmItem {

    data class Success(
        val id: Int,
        val hours: Byte,
        val minutes: Byte,
        val days: List<Boolean>,
        val vibro: Boolean,
        val isActive: Boolean,
        val description: String
    ) : UiAlarmItem
}