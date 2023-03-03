package com.geektech.tradehouse.presentation.ui.ad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.geektech.tradehouse.databinding.FragmentAdBinding


class AdFragment : Fragment() {
    private lateinit var binding: FragmentAdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAdBinding.inflate(layoutInflater)
        return binding.root
    }

}