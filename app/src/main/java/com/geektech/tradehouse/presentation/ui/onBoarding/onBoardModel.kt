package com.geektech.tradehouse.presentation.ui.onBoarding

import java.io.Serializable

data class OnBoardModel (
    var onboardImage : Int? = null,
    var onboardTitle: String? = null,
    var onboardDescription: String? = null
): Serializable