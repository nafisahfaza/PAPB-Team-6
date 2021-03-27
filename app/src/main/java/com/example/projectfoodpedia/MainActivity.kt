package com.example.projectfoodpedia

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.projectfoodpedia.ViewModel.MealsViewModel


class MainActivity : AppCompatActivity() {
    private lateinit var ViewModel:MealsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)
        ViewModel=ViewModelProvider(this).get

//        val button: Button = findViewById(R.id.button_id)
//
  }
}