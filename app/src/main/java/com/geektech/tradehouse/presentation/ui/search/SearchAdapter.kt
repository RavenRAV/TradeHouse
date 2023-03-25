package com.geektech.tradehouse.presentation.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.geektech.tradehouse.data.network.model.ResultsDTO
import com.geektech.tradehouse.databinding.ItemHousesBinding

class SearchAdapter(val list: ArrayList<ResultsDTO>)
    : RecyclerView.Adapter<SearchAdapter.SearchViewHolder>(){

        inner class SearchViewHolder(val binding: ItemHousesBinding): RecyclerView.ViewHolder(binding.root){
            fun onBind(results: ResultsDTO){
                with(binding){
                    ivHouse.load(results.image)
                    tvPrice.setText(results.price.toString())
                    tvFloor.setText(results.floor.toString())
                    tvAreaOfLand.setText(results.square.toString())
                    tvAreaOfHouse.setText(results.area.title.toString())
                    tvAddress.setText(results.address.toString())

                }
            }
        }

    fun addPage(page: ArrayList<ResultsDTO>){
        list.addAll(page)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        return SearchViewHolder(
            ItemHousesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount() = list.size

}
