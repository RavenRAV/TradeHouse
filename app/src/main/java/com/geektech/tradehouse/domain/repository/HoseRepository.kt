package com.geektech.tradehouse.domain.repository

import com.geektech.tradehouse.domain.model.House
import com.geektech.tradehouse.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface HoseRepository {
    fun getAllHouses() : Flow<Resource<List<House>>>
}