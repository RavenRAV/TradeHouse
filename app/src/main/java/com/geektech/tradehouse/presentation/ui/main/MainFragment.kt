package com.geektech.tradehouse.presentation.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.tradehouse.R
import com.geektech.tradehouse.databinding.FragmentMainBinding
import com.geektech.tradehouse.presentation.base.BaseFragment
import com.geektech.tradehouse.presentation.base.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding, BaseViewModel>(R.layout.fragment_main) {
    override val binding by viewBinding(FragmentMainBinding::bind)
    override val viewModel by viewModels<BaseViewModel>()



}



