package com.geektech.tradehouse.presentation.ui.search

import com.geektech.tradehouse.data.network.model.HouseModel
import com.geektech.tradehouse.domain.use_case.GetAllHousesUseCase
import com.geektech.tradehouse.presentation.base.BaseViewModel
import com.geektech.tradehouse.presentation.utils.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getAllHousesUseCase: GetAllHousesUseCase
): BaseViewModel() {
    private val _getAllHousesState = MutableStateFlow<UIState<HouseModel>>(UIState.Empty())
    val getAllHousesState = _getAllHousesState.asStateFlow()

    fun getAllHouses(){
        getAllHousesUseCase().collectFlow(_getAllHousesState)
    }
}
