package com.geektech.tradehouse.data.network.api

import com.geektech.tradehouse.data.network.model.HouseModelDTO
import com.geektech.tradehouse.data.network.model.HouseModelCreateDTO
import retrofit2.http.*

interface HouseApi {
    @GET("products")
    suspend fun getHouses(
        @Query("page") page: Int
    ): HouseModelDTO


    @POST("create")
    suspend fun createAd(
        @Body data: HouseModelCreateDTO
    ): HouseModelCreateDTO
}