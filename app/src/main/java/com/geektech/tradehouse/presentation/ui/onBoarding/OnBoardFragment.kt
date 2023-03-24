package com.geektech.tradehouse.presentation.ui.onBoarding

import android.content.SharedPreferences
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.tradehouse.R
import com.geektech.tradehouse.databinding.FragmentOnBoardBinding
import com.geektech.tradehouse.presentation.base.BaseFragment
import com.geektech.tradehouse.presentation.base.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnBoardFragment :
    BaseFragment<FragmentOnBoardBinding, BaseViewModel>(R.layout.fragment_on_board),
    OnboardAdapter.BoardClick {
    override val binding by viewBinding(FragmentOnBoardBinding::bind)
    override val viewModel by viewModels<BaseViewModel>()

    @Inject
    lateinit var preference: SharedPreferences

    override fun initialize() {
        super.initialize()
        if (preference.getBoolean("is_show", false)) {
            findNavController().navigate(R.id.searchFragment)
        }

        val adapter = OnboardAdapter(
                this
            )
        binding.onboadViewpager.adapter= adapter
        binding.springDotsIndicator.attachTo(binding.onboadViewpager)
    }

    override fun onClick() {
        preference.edit().putBoolean("is_show", true).apply()
        findNavController().navigate(R.id.searchFragment)
    }


}