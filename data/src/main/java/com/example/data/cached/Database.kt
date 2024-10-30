package com.example.data.cached

import androidx.room.Database

@Database(entities = [AlarmItemDTO::class], version = 1)
abstract class Database {
    abstract fun alarmDao() : DataSourceDao
}