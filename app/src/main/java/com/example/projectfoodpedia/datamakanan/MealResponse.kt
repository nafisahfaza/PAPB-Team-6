package com.example.projectfoodpedia.datamakanan

import com.google.gson.annotations.SerializedName

data class MealResponse(
    @SerializedName("idMeal")
    val id: String,

    @SerializedName("strMeal")
    val name: String,

    @SerializedName("strMealThumb")
    val picture: String
)

data class ListMealResponse(
    @SerializedName("meals")
    val meals: List<MealResponse>
)