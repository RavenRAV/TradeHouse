package com.geektech.tradehouse.presentation.ui.search

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.tradehouse.R
import com.geektech.tradehouse.data.network.model.Area
import com.geektech.tradehouse.data.network.model.HouseModel
import com.geektech.tradehouse.data.network.model.Results
import com.geektech.tradehouse.data.network.model.Type
import com.geektech.tradehouse.databinding.FragmentSearchBinding
import com.geektech.tradehouse.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding, SearchViewModel>(R.layout.fragment_search) {

    override val binding by viewBinding(FragmentSearchBinding::bind)
    override val viewModel by viewModels<SearchViewModel>()
    var adapter = SearchAdapter(arrayListOf())
//    private val data = arrayListOf<Results>()

    override fun initialize() {
//       var adapter = SearchAdapter(data)
//        binding.rvSearch.adapter = adapter
    }

    override fun setupRequest() {
        super.setupRequest()
        viewModel.getAllHouses()
    }

    override fun setupSubscribers() {
        super.setupSubscribers()
        viewModel.getAllHousesState.collectState(
            onError = {},
            onLoading = {},
            onSuccess = {
                Log.e("ololo", "setupSubscribers: $it",)
//                adapter = SearchAdapter(it as ArrayList<HouseModel>)
//                binding.rvSearch.adapter = adapter
            }
        )
    }



}