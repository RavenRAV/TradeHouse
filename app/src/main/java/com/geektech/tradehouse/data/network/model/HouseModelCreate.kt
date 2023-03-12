package com.geektech.tradehouse.data.network.model

data class HouseModelCreate (
    val id : Int,
    val type_list : String,
    val type : Int,
    val area: Int,
    val rooms: Int,
    val image : String,
    val video : String,
    val price : Int,
    val address : String,
    val phone_number : String,
    val square : String,
    val living_space : Int,
    val ceiling_height : Int,
    val floor : Int,
    val repair : String,
    val furniture : String,
    val bathroom : String,
    val window : String,
    val warm_floor : String,
    val balcony : String,
    val description : String

        )
