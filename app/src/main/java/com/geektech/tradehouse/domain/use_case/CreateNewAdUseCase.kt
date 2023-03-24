package com.geektech.tradehouse.domain.use_case

import com.geektech.tradehouse.data.network.model.HouseModelCreateDTO
import com.geektech.tradehouse.domain.repository.HoseRepository
import javax.inject.Inject

class CreateNewAdUseCase @Inject constructor(
    private val houseRepository: HoseRepository
){
    operator fun invoke(data: HouseModelCreateDTO) = houseRepository.createNewAd(data)
}