package com.example.goridez

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class Vehicle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicle)

        // To display the vehicle description

         var viewPager=findViewById<ViewPager2>(R.id.imageViewer)
         var vehiclePrice = findViewById<TextView>(R.id.vehiclePrice)
         var vehicleDescription = findViewById<TextView>(R.id.vehicleDescription)
         var bookButton = findViewById<Button>(R.id.bookButton)
         var subDescription = findViewById<TextView>(R.id.subDescription)
         var contactButton = findViewById<FloatingActionButton>(R.id.contactButton)


        var placeData:PlaceData = ViewModelProvider(this).get(PlaceData::class.java)
        var id=intent.getStringExtra("index")
        var place:Place=placeData.places.get(id!!.toInt())


        vehiclePrice.text = place.price.toString()
        vehicleDescription.text = place.description
        subDescription.text = place.subDescription

        //To display the snackbar message on clicking the buttons

        bookButton.setOnClickListener {
            val snackbar = Snackbar.make(it,"Your Ride has been Booked", Snackbar.LENGTH_LONG)
            snackbar.show();
        }

        contactButton.setOnClickListener {
            val snackbar = Snackbar.make(it,"Seller will get back to you shortly", Snackbar.LENGTH_LONG)
            snackbar.show();
        }

        //To display the swiper images in the view Pager
        var imagesList = place.imagesList
        viewPager.adapter=ViewPagerAdapter(this,imagesList)



    }
}