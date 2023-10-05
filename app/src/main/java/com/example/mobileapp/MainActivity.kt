package com.example.mobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cityData = arrayOf(
            City("India","New Delhi"),
            City("USA","New York"),
            City("France","Paris"),
            City("Italy","Rome"),
            City("Netherland","Amsterdam-hello"),
        )
        val cities = findViewById<ListView>(R.id.cities)
        val cityAdapter = CityAdapter(cityData)
        cities.adapter = cityAdapter
    }
}
