package com.geektech.tradehouse.domain.model

import java.io.Serializable

data class House(
    val id: Int = DEFAULT_ID,
    val image: String? = null,
    val price: Int? = null
): Serializable {
    companion object{
        const val DEFAULT_ID = 0
    }
}