package com.example.goridez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SearchView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CityList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.city_list)

        //Fetching the recycler view from city_list to display the city list
        var cityRecyclerView = findViewById<RecyclerView>(R.id.cityRecyclerView)
        var placeData: PlaceData = ViewModelProvider(this).get(PlaceData::class.java)
        var cityListAdapter = CityListAdapter(this, placeData.cities)
        cityRecyclerView.adapter = cityListAdapter

        var searchBar = findViewById<EditText>(R.id.searchBar)
        var searchButton = findViewById<FloatingActionButton>(R.id.searchButton)

        //Setting a OnClick on the search button to search the vehicle shops

        searchButton.setOnClickListener{
            var list = mutableListOf<Place>()
            for (i in 0 until placeData.places.size) {
                if(placeData.places.get(i).placeName == searchBar.text.toString()){
                    list.add(placeData.places.get(i))
                }
            }
            cityRecyclerView.adapter = RentalShopAdapter(this,list)
        }
        cityRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}