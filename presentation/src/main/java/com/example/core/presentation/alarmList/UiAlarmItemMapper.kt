package com.example.core.presentation.alarmList

import com.example.domain.model.AlarmItem

class UiAlarmItemMapper : AlarmItem.Mapper<AlarmItem.Success, UiAlarmItem> {
    override fun map(item: AlarmItem.Success) = UiAlarmItem.Success(
        id = item.id,
        hours = item.hours,
        minutes = item.minutes,
        days = item.days,
        vibro = item.vibro,
        isActive = item.isActive,
        description = item.description
    )
}