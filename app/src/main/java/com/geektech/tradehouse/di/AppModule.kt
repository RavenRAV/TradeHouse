package com.geektech.tradehouse.di

import com.geektech.tradehouse.data.network.api.HouseApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideHouseApi():HouseApi{
        return Retrofit.Builder()
            .baseUrl("http://164.92.190.147:1235/api/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(HouseApi::class.java)
    }

}
