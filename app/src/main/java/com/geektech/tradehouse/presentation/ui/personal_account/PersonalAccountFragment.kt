package com.geektech.tradehouse.presentation.ui.personal_account

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.tradehouse.R
import com.geektech.tradehouse.databinding.FragmentPersonalAccountBinding
import com.geektech.tradehouse.presentation.base.BaseFragment

class PersonalAccountFragment : BaseFragment<FragmentPersonalAccountBinding, PersonalViewModel>(R.layout.fragment_personal_account) {
    override val binding by viewBinding(FragmentPersonalAccountBinding::bind)
    override val viewModel by viewModels<PersonalViewModel>()

    override fun initialize() {
        super.initialize()
    }

    override fun setupListeners() {
        super.setupListeners()
        binding.imgBack.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }


}