package com.example.projectfoodpedia.datamakanan

import com.google.gson.annotations.SerializedName

data class CategoryResponse(
    @SerializedName("idCategory")
    val id: String,

    @SerializedName("strCategory")
    val category: String,

    @SerializedName("strCategoryThumb")
    val picture: String
)

data class ListCategoryResponse(
    @SerializedName("categories")
    val categories: List<CategoryResponse>
)