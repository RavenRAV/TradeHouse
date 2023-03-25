package com.geektech.tradehouse.presentation.extention

import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.geektech.tradehouse.R

fun Fragment.showToast(text: String){
    Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
}

fun Fragment.showToast(@StringRes text: Int){
    Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
}