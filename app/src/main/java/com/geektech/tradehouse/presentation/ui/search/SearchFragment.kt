package com.geektech.tradehouse.presentation.ui.search

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.tradehouse.R
import com.geektech.tradehouse.data.network.model.ResultsDTO
import com.geektech.tradehouse.databinding.FragmentSearchBinding
import com.geektech.tradehouse.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseFragment<
        FragmentSearchBinding,
        SearchViewModel>(R.layout.fragment_search) {

    override val binding by viewBinding(FragmentSearchBinding::bind)
    override val viewModel by viewModels<SearchViewModel>()
    var adapter = SearchAdapter(arrayListOf())
    private val data = arrayListOf<ResultsDTO>()
    var page: Int = 1

    override fun initialize() {
        binding.rvSearch.addOnScrollListener(object: RecyclerView.OnScrollListener(){
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollVertically(1)){
                    viewModel.getAllHouses(++page)
                }
            }
        })
    }

    override fun setupRequest() {
        super.setupRequest()
        viewModel.getAllHouses(page)
        Log.e("loglog", "setupRequest: ", )
    }

    override fun setupSubscribers() {
        super.setupSubscribers()
        viewModel.getAllHousesState.collectState(
            onError = {},
            onLoading = {},
            onSuccess = {
                Log.e("ololo", "setupSubscribers: $it",)
//                adapter = SearchAdapter(it.results)

                if (it.results != null){

                    adapter.addPage(it.results)
                    binding.rvSearch.adapter = adapter
                }


            }
        )
    }





}