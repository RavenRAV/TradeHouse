package com.geektech.tradehouse.presentation.ui.onBoarding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.geektech.tradehouse.R
import com.geektech.tradehouse.databinding.ItemBoardBinding

class OnboardAdapter(val listener: BoardClick) :
    RecyclerView.Adapter<OnboardAdapter.OnboardViewHolder>() {
    private val arrayListBoarding = arrayListOf<OnBoardModel>()

    init {
        arrayListBoarding.add(
            OnBoardModel(
                R.raw.home_desc,
                "Добро пожаловать в наше приложение! ",
                "Мы рады видеть вас здесь и готовы помочь вам в поиске идеального дома!"
            )
        )


        arrayListBoarding.add(
            OnBoardModel(
                R.raw.animation_scanning,
                "Регистрация",
                "Зарегистрируйтесь или войдите в существующую учетную запись чтобы получить доступ ко всем функциям приложения."
            )
        )

        arrayListBoarding.add(
            OnBoardModel(
                R.raw.animation_searching,
                "Начните свой путь к идеальному жилью сейчас!",
                "Вы можете просматривать доступные объекты недвижимости, фильтровать их по вашим параметрам и даже связаться с продавцом, чтобы уточнить детали."
            )
        )

        arrayListBoarding.add(
            OnBoardModel(
                R.raw.home_start,
                "Удачного поиска!",
                "Мы всегда рады помочь вам и уверены, что с нашим приложением вы сможете найти свой идеальный дом."
            )
        )


        arrayListBoarding.add(
            OnBoardModel(
                null,
                null,
                null
            )
        )



    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardViewHolder {
        return OnboardViewHolder(
            ItemBoardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false)
        )
    }

    override fun onBindViewHolder(holder: OnboardViewHolder, position: Int) {
        holder.bind(arrayListBoarding[position])
    }

    override fun getItemCount(): Int = arrayListBoarding.size

    inner class OnboardViewHolder(private val binding: ItemBoardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(boardModel: OnBoardModel) {
            with(binding){
                onBoardBtnStart.setOnClickListener{
                    listener.onClick()
                }
                onBoardTvTitle.text = boardModel.onboardTitle
                onBoardTvDescription.text = boardModel.onboardDescription
                onBoardBtnContainer.isVisible = adapterPosition == arrayListBoarding.size -1
                onBoardDescContainer.isGone = adapterPosition == arrayListBoarding.size -1
                boardModel.onboardImage?.let { onBoardImage.setAnimation(it) }

            }
        }

    }

    interface BoardClick {
        fun onClick()
    }
}