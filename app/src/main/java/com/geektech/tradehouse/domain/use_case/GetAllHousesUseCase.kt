package com.geektech.tradehouse.domain.use_case

import com.geektech.tradehouse.domain.repository.HoseRepository
import javax.inject.Inject

class GetAllHousesUseCase @Inject constructor(
    private val houseRepository: HoseRepository
){
    operator fun invoke() = houseRepository.getAllHouses()
}