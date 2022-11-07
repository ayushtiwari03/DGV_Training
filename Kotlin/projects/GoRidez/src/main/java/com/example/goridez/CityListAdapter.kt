package com.example.goridez

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityListAdapter (val context: Context,val cities:List<String>):RecyclerView.Adapter<CityListAdapter.ViewHolder>(){

    //Creating the Adapter to display the city List

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.activity_main,
                parent,
               false
        )
       )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var city = cities.get(position)
        holder.citName.text = city

        holder.citName.setOnClickListener {
            val intent = Intent(context,RentalShops::class.java)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return cities.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var citName = view.findViewById<TextView>(R.id.cityName)

    }

}