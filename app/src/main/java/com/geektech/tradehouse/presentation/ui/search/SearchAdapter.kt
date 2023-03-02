package com.geektech.tradehouse.presentation.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import coil.load
import com.geektech.tradehouse.data.network.model.Results
import com.geektech.tradehouse.databinding.ItemHousesBinding

class SearchAdapter(val list: ArrayList<Results>)
    : RecyclerView.Adapter<SearchAdapter.SearchViewHolder>(){

        inner class SearchViewHolder(val binding: ItemHousesBinding): RecyclerView.ViewHolder(binding.root){
            fun onBind(results: Results){
                with(binding){
                    ivHouse.load(results.image)
                    tvPrice.setText(results.price.toString())
                    tvFloor.setText(results.floor.toString())
                    tvAreaOfLand.setText(results.square.toString())
                    tvAreaOfHouse.setText(results.area.title.toString())
                    tvAddress.setText(results.area.title.toString())

                }
            }
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

    override fun getItemCount() = 2

}
