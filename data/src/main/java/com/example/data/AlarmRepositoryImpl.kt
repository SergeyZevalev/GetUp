package com.example.data

import com.example.data.cached.AlarmItemDTO
import com.example.data.cached.DataSourceDao
import com.example.domain.model.AlarmItem
import com.example.domain.data.AlarmRepository
import javax.inject.Inject

class AlarmRepositoryImpl @Inject constructor(
    private val cachedDataSource: DataSourceDao,
    private val mapper: AlarmItem.Mapper<AlarmItemDTO, AlarmItem>
) : AlarmRepository {

    override fun getAlarmList() = cachedDataSource.getAlarmList().map { mapper.map(it) }

    override fun addAlarm() {
        TODO("Not yet implemented")
    }

    override fun removeAlarm(itemId: Int) {
        TODO("Not yet implemented")
    }
}