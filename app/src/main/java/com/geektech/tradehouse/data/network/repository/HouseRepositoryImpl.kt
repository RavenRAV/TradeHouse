package com.geektech.tradehouse.data.network.repository

import com.geektech.tradehouse.data.base.BaseRepository
import com.geektech.tradehouse.data.network.api.HouseApi
import com.geektech.tradehouse.data.network.model.HouseModel
import com.geektech.tradehouse.domain.repository.HoseRepository
import com.geektech.tradehouse.domain.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class HouseRepositoryImpl @Inject constructor(
    private val houseApi: HouseApi
) : HoseRepository, BaseRepository() {
//        override fun getAllHouses(): Flow<Resource<List<HouseModel>>>
//    = doRequest{
//        houseApi.getProducts()
//    }

    override fun getAllHouses(): Flow<Resource<HouseModel>>
    =
         doRequest{
        houseApi.getHouses()
    }



}