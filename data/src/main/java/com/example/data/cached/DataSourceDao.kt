package com.example.data.cached

import androidx.room.Dao
import androidx.room.Query

@Dao
interface DataSourceDao {

    @Query("SELECT * FROM alarmitemdto")
    fun getAlarmList() : List<AlarmItemDTO>

}