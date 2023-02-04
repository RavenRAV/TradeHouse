package com.geektech.tradehouse.presentation.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.geektech.tradehouse.domain.utils.Resource
import com.geektech.tradehouse.presentation.utils.UIState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel(){

    protected fun <T> Flow<Resource<T>>.collectFlow(_state: MutableStateFlow<UIState<T>>){
        viewModelScope.launch() {
            this@collectFlow.collect(){
                when(it){
                    is Resource.Loading -> {
                        _state.value = UIState.Loading()
                    }
                    is Resource.Error -> {
                        _state.value = UIState.Error(it.message!!)
                    }
                    is Resource.Success -> {
                        if(it.data != null) {
                            _state.value = UIState.Success(it.data)
                        }
                    }
                }
            }
        }

    }
}