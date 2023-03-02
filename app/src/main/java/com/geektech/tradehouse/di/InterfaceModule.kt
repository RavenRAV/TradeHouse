package com.geektech.tradehouse.di

import com.geektech.tradehouse.data.network.repository.HouseRepositoryImpl
import com.geektech.tradehouse.domain.repository.HoseRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface InterfaceModule {

    @Binds
    fun provideRepository (houseRepositoryImpl: HouseRepositoryImpl) : HoseRepository

}