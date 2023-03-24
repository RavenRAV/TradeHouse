package com.geektech.tradehouse.presentation.ui.profile

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.tradehouse.R
import com.geektech.tradehouse.databinding.FragmentProfileBinding
import com.geektech.tradehouse.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : BaseFragment<FragmentProfileBinding, ProfileViewModel>(R.layout.fragment_profile) {
    override val binding by viewBinding(FragmentProfileBinding::bind)
    override val viewModel by viewModels<ProfileViewModel>()

    override fun setupListeners() {
        binding.containerProfile.setOnClickListener {
            findNavController().navigate(R.id.personalAccountFragment)
        }
        binding.btnAddProfile.setOnClickListener {
            findNavController().navigate(R.id.createAdFragment)
        }
    }

}