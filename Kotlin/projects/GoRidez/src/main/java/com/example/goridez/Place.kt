package com.example.goridez

class Place(placeName:String, placeAddress:String, placeImage:Int, category:String, description:String, subDescription:String, price:String, id:Int, imagesList:List<Int>){

    var placeName:String = ""
    var placeAddress:String = ""
    var placeImage:Int = 0
    var category:String = ""
    var description:String =""
    var subDescription:String = ""
    var price:String = ""
    var id:Int = 0
    var imagesList: List<Int> =listOf<Int>()

    init {
        this.placeName = placeName
        this.placeAddress = placeAddress
        this.placeImage = placeImage
        this.category = category
        this.description = description
        this.price = price
        this.id = id
        this.subDescription = subDescription
        this.imagesList= imagesList
    }
}