package com.geektech.tradehouse.data.network.api

import com.geektech.tradehouse.data.network.model.HouseModel
import retrofit2.http.GET

interface HouseApi {
    @GET("products")
    suspend fun getHouses(): HouseModel
//
//    @GET("products")
//    fun getHouses(): Call<HouseModel>
}