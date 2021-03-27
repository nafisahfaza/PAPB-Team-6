package com.example.projectfoodpedia.ViewModel

import com.example.projectfoodpedia.datamakanan.CategoryResponse
import com.example.projectfoodpedia.utils.DataDummy

class MealsViewModel {
    fun getCategory(): ArrayList<CategoryResponse> = DataDummy.DummyModels()
}