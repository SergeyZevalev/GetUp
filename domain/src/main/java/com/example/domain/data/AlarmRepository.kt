package com.example.domain.data

import com.example.domain.model.AlarmItem

interface AlarmRepository {

    fun getAlarmList() : List<AlarmItem>
    fun addAlarm()
    fun removeAlarm(itemId: Int)
}