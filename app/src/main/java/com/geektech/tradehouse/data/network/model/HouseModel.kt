package com.geektech.tradehouse.data.network.model

data class HouseModel(
    val count    : Int,
    val next     : String,
    val previous : String,
    val results  : ArrayList<Results>
)

data class Results (
    val id     : Int,
    val type   : Type,
    val image  : String,
    val price  : Int,
    val floor  : Int,
    val area   : Area,
    val square : String
        )

data class Type (
    val title : String
)

data class Area (
    val title : String
)

