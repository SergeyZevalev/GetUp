package com.example.data.cached

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AlarmItemDTO(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "hours") val hours: Byte,
    @ColumnInfo(name = "minutes") val minutes: Byte,
    @ColumnInfo(name = "days") val days: List<Boolean>,
    @ColumnInfo(name = "vibro") val vibro: Boolean,
    @ColumnInfo(name = "isActive") val isActive: Boolean,
    @ColumnInfo(name = "description") val description: String
)
