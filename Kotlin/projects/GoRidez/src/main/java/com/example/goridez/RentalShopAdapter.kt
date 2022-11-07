package com.example.goridez

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class RentalShopAdapter(val context: Context,val shops:List<Place>):RecyclerView.Adapter<RentalShopAdapter.ViewHolder>() {

    // Creating the Adapter to display the list of Rental Shops

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.activity_rental_shop,
                parent,false
            )
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var shop = shops.get(position)
        holder.shopName.text = shop.placeName
        holder.shopAddress.text = shop.placeAddress
        holder.shopLogo.setImageResource(shop.placeImage)

        holder.shopLogo.setOnClickListener {
            val intent = Intent(context,Vehicle::class.java)
            intent.putExtra("index",shop.id.toString())
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return shops.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var shopLogo = view.findViewById<ImageView>(R.id.shopLogo)
        var shopName = view.findViewById<TextView>(R.id.shopName)
        var shopAddress = view.findViewById<TextView>(R.id.shopAddress)

    }
}