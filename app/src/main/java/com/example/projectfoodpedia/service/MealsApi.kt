package com.example.projectfoodpedia.service

import com.example.projectfoodpedia.datamakanan.CategoryResponse
import com.example.projectfoodpedia.datamakanan.ListCategoryResponse
import com.example.projectfoodpedia.datamakanan.ListMealDetails
import com.example.projectfoodpedia.datamakanan.ListMealResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MealsApi {
    @GET ("categories.php")
    fun getListCategories(): ListCategoryResponse

    @GET ("filter.php")
    fun getListMeal(@Query("c") c : String): ListMealResponse

//    @GET ("filter.php?c={category}")
//    fun getListMeal(@Path("category") category : String): ListMealResponse

    @GET ("lookup.php")
    fun getCategories(@Query("i") i : String): ListMealDetails
}