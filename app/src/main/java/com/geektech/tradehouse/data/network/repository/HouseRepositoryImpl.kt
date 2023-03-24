package com.geektech.tradehouse.data.network.repository

import com.geektech.tradehouse.data.base.BaseRepository
import com.geektech.tradehouse.data.network.api.HouseApi
import com.geektech.tradehouse.data.network.model.HouseModelDTO
import com.geektech.tradehouse.data.network.model.HouseModelCreateDTO
import com.geektech.tradehouse.domain.repository.HoseRepository
import com.geektech.tradehouse.domain.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HouseRepositoryImpl @Inject constructor(
    private val houseApi: HouseApi
) : HoseRepository, BaseRepository() {
//        override fun getAllHouses(): Flow<Resource<List<HouseModel>>>
//    = doRequest{
//        houseApi.getProducts()
//    }

    override fun getAllHouses(): Flow<Resource<HouseModelDTO>>
    =
         doRequest{
        houseApi.getHouses()
    }

    override fun createNewAd(data: HouseModelCreateDTO): Flow<Resource<HouseModelCreateDTO>>
    =
        doRequest{
        houseApi.createAd(data)
    }






}