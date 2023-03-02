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

//<EditText
//android:id="@+id/et_search"
//android:layout_width="300dp"
//android:layout_height="42dp"
//android:background="@drawable/rounded_edittext_background"
//android:drawableStart="@drawable/search"
//android:drawablePadding="8dp"
//android:hint="@string/search"
//tools:ignore="MissingConstraints" />
//
//<ImageButton
//android:id="@+id/et_filter"
//android:layout_width="50dp"
//android:layout_height="42dp"
//android:layout_marginStart="8dp"
//android:background="@drawable/rounded_edittext_background"
//android:contentDescription="@string/filter"
//android:src="@drawable/filter"
//app:layout_constraintEnd_toEndOf="parent"
//app:layout_constraintStart_toEndOf="@id/et_search"
//tools:ignore="MissingConstraints" />
//
//<androidx.recyclerview.widget.RecyclerView
//android:layout_width="match_parent"
//android:layout_height="wrap_content"
//android:layout_marginTop="30dp"
//app:layout_constraintTop_toBottomOf="@id/et_search"
//tools:listitem="@layout/item_houses" />


