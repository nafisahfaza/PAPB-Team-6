package com.example.projectfoodpedia.datamakanan

import com.google.gson.annotations.SerializedName

data class MealDetails (
    @SerializedName("idMeal")
    val id: String,

    @SerializedName("strMeal")
    val name: String,

    @SerializedName("strCategory")
    val category: String,

    @SerializedName("strInstructions")
    val instruction: String
)

data class ListMealDetails(
    @SerializedName("meals")
    val meals: List<MealDetails>
)