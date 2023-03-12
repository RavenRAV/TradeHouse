package com.geektech.tradehouse.presentation.ui.create_ad

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.tradehouse.R
import com.geektech.tradehouse.databinding.FragmentCreateAdBinding
import com.geektech.tradehouse.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateAdFragment : BaseFragment<
        FragmentCreateAdBinding,
        CreateAdViewModel>(R.layout.fragment_create_ad) {
    override val binding by viewBinding(FragmentCreateAdBinding::bind)
    override val viewModel by viewModels<CreateAdViewModel>()


}