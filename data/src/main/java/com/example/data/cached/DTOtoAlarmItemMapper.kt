package com.example.data.cached

import com.example.domain.model.AlarmItem

class DTOtoAlarmItemMapper : AlarmItem.Mapper<AlarmItemDTO, AlarmItem> {

    override fun map(item: AlarmItemDTO) = AlarmItem.Success(
        id = item.id,
        hours = item.hours,
        minutes = item.minutes,
        days = item.days,
        vibro = item.vibro,
        isActive = item.isActive,
        description = item.description
    )
}