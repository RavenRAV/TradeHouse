package com.geektech.tradehouse.presentation.ui.onBoarding

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.tradehouse.R
import com.geektech.tradehouse.databinding.FragmentOnBoardBinding
import com.geektech.tradehouse.presentation.base.BaseFragment
import com.geektech.tradehouse.presentation.base.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnBoardFragment :
    BaseFragment<FragmentOnBoardBinding, BaseViewModel>(R.layout.fragment_on_board),
    com.geektech.tradehouse.presentation.ui.onBoarding.OnboardAdapter.BoardClick {
    override val binding by viewBinding(FragmentOnBoardBinding::bind)
    override val viewModel by viewModels<BaseViewModel>()

    override fun initialize() {
        super.initialize()
        val adapter = OnboardAdapter(
                this
            )
        binding.onboadViewpager.adapter= adapter
        binding.springDotsIndicator.attachTo(binding.onboadViewpager)
    }

    override fun onClick() {
        findNavController().navigate(R.id.searchFragment)
    }


}