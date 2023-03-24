package com.geektech.tradehouse.domain.repository

import com.geektech.tradehouse.data.network.model.HouseModelDTO
import com.geektech.tradehouse.data.network.model.HouseModelCreateDTO
import com.geektech.tradehouse.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface HoseRepository {
    fun getAllHouses() : Flow<Resource<HouseModelDTO>>

    fun createNewAd(data: HouseModelCreateDTO): Flow<Resource<HouseModelCreateDTO>>
}