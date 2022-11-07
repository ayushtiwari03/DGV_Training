package com.example.goridez

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ViewPagerAdapter (val context: Context,val imageList:List<Int>):RecyclerView.Adapter<ViewPagerAdapter.Viewholder>() {

    //To connect the View Pager with the swiper images

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(
            LayoutInflater.from(context).inflate(R.layout.slider_item,parent,false)

        )
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {

        var image=imageList.get(position)

        Picasso.get().load(image).into(holder.imageView)


    }

    override fun getItemCount(): Int {
        return imageList.size
    }


    class Viewholder(view: View):RecyclerView.ViewHolder(view)
    {
        val imageView=view.findViewById<ImageView>(R.id.sliderImage)
    }
}