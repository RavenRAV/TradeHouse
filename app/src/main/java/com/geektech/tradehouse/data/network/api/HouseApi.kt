package com.geektech.tradehouse.data.network.api

import com.geektech.tradehouse.data.network.model.HouseModelDTO
import com.geektech.tradehouse.data.network.model.HouseModelCreateDTO
import okhttp3.MultipartBody
import retrofit2.http.*

interface HouseApi {
    @GET("products")
    suspend fun getHouses(): HouseModelDTO

    @Multipart
    @POST("create")
    suspend fun createAd(
        @Body data: HouseModelCreateDTO,
        @Part image: MultipartBody.Part
    ): HouseModelCreateDTO
}