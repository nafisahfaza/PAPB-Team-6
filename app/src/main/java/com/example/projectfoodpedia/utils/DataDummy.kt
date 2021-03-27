package com.example.projectfoodpedia.utils

import com.example.projectfoodpedia.datamakanan.CategoryResponse

object DataDummy {
    fun DummyModels(): ArrayList<CategoryResponse> {
        return arrayListOf(
            CategoryResponse(
                "1", "lunch", "http://kbu-cdn.com/dk/wp-content/uploads/spaghetti-poll-pedas.jpg"
            ),
            CategoryResponse(
                "2", "lunch", "https://www.rukita.co/stories/wp-content/uploads/2020/02/byurger.jpg"
            ),
            CategoryResponse(
                "3", "dinner", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Ice_cream_with_whipped_cream%2C_chocolate_syrup%2C_and_a_wafer_%28cropped%29.jpg/1200px-Ice_cream_with_whipped_cream%2C_chocolate_syrup%2C_and_a_wafer_%28cropped%29.jpg"
            )
        )
    }
}