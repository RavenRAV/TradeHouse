package com.geektech.tradehouse.data.network.model

data class HouseModelDTO(
    val count    : Int,
    val next     : String,
    val previous : String,
    val results  : ArrayList<ResultsDTO>
)

data class ResultsDTO (
    val id     : Int,
    val typeDTO   : TypeDTO,
    val image  : String,
    val price  : Int,
    val floor  : Int,
    val area   : AreaDTO,
    val square : String,
    val address : String
        )

data class TypeDTO (
    val title : String
)

data class AreaDTO (
    val title : String
)

