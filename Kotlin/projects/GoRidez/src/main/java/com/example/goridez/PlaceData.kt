package com.example.goridez

import androidx.lifecycle.ViewModel

class PlaceData: ViewModel() {

    // ViewModel to persist the data in the layout

    var places = listOf<Place>(
        Place("Mystic Wheel","Sector 1, Nerul",R.drawable.image1,"Navi Mumbai","Three Bikes are availaible in a great condition with helmets included.","Do bring your ID while collecting your ride!!","700/day",1,listOf(R.drawable.pulsar,R.drawable.bullet3,R.drawable.ntorq)),
        Place("Rapid Rent","Sector 4, Nerul",R.drawable.image2,"Navi Mumbai","Three Bikes are availaible in a great condition with helmets included.","Do bring your ID while collecting your ride!!","700/day",2,listOf(R.drawable.bullet2,R.drawable.pulsar2,R.drawable.ntorq3)),
        Place("AutoZ","Sector 2, Vashi",R.drawable.image3,"Navi Mumbai","Three Bikes are availaible in a great condition with helmets included.","Do bring your ID while collecting your ride!!","700/day",3,listOf(R.drawable.pulsar3,R.drawable.bullet4,R.drawable.ntorq2)),
        Place("Roller Rentals","Sector 5, Ghansoli",R.drawable.image4,"Navi Mumbai","Three Bikes are availaible in a great condition with helmets included.","Do bring your ID while collecting your ride!!","700/day",4,listOf(R.drawable.pulsar4,R.drawable.bullet5,R.drawable.ntorq5)),
        Place("Drive Now","Sector 7, Belapur",R.drawable.image5,"Navi Mumbai","Three Bikes are availaible in a great condition with helmets included.","Do bring your ID while collecting your ride!!","700/day",5,listOf(R.drawable.pulsar5,R.drawable.bullet6,R.drawable.ntorq4)),
        Place("Speedy Wheels","Sector 6, Turbhe",R.drawable.image6,"Navi Mumbai","Three Bikes are availaible in a great condition with helmets included.","Do bring your ID while collecting your ride!!","700/day",6,listOf(R.drawable.ntorq3,R.drawable.bullet5,R.drawable.pulsar6)),
        Place("Go Go Car","Sector 8, Seawoods",R.drawable.image7,"Navi Mumbai","Three Bikes are availaible in a great condition with helmets included.","Do bring your ID while collecting your ride!!","700/day",7,listOf(R.drawable.pulsar6,R.drawable.bullet8,R.drawable.ntorq2)),
        Place("Rent N Go","Sector 9, Vashi",R.drawable.vehicle,"Navi Mumbai","Three Bikes are availaible in a great condition with helmets included.","Do bring your ID while collecting your ride!!","700/day",8,listOf(R.drawable.pulsar4,R.drawable.bullet6,R.drawable.ntorq5))
    )

    var cities = listOf<String>(
        "Mumbai", "Navi Mumbai", "Pune","Lonavla"
    )

}