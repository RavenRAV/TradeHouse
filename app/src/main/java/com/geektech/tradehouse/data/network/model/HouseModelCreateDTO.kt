package com.geektech.tradehouse.data.network.model

import android.net.Uri
import com.google.gson.annotations.SerializedName

data class HouseModelCreateDTO(
    val id: Int,
    @SerializedName("type_list")
    val typeList: String,
    val type: Int,
    val area: Int,
    val rooms: Int,
//    val image: String?,
    val video: String,
    val price: Int,
    val address: String,
    @SerializedName("phone_number")
    val phoneNumber: String,
    val square: String,
    @SerializedName("living_space")
    val livingSpace: Int,
    @SerializedName("ceiling_height")
    val ceilingHeight: Int,
    val floor: Int,
    val repair: String,
    val furniture: String,
    val bathroom: String,
    val window: String,
    @SerializedName("warm_floor")
    val warmFloor: String,
    val balcony: String,
    val description: String

        )
