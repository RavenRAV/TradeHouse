package com.geektech.tradehouse.presentation.ui.create_ad

import com.geektech.tradehouse.data.network.model.HouseModelCreateDTO
import com.geektech.tradehouse.domain.use_case.CreateNewAdUseCase
import com.geektech.tradehouse.presentation.base.BaseViewModel
import com.geektech.tradehouse.presentation.utils.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import okhttp3.MultipartBody
import javax.inject.Inject

@HiltViewModel
class CreateAdViewModel @Inject constructor(
    private val createNewAdUseCase: CreateNewAdUseCase
) : BaseViewModel(){
    private val _createNewAdState = MutableStateFlow<UIState<HouseModelCreateDTO>>(UIState.Empty())
    val createNewAdState = _createNewAdState.asStateFlow()

    fun createNewAd(data: HouseModelCreateDTO){
        createNewAdUseCase(data).collectFlow(_createNewAdState)
    }
}