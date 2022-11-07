package com.example.goridez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RentalShops : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rental_shop_list)

        //Fetching the recycler view for rental shop list to display the Rental Places List

        var shopRecyclerView = findViewById<RecyclerView>(R.id.rentalShopRecycler)
        var placeData: PlaceData = ViewModelProvider(this).get(PlaceData::class.java)
        var rentalShopAdapter = RentalShopAdapter(this, placeData.places)
        shopRecyclerView.adapter = rentalShopAdapter

        shopRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}