package com.example.hafta_5
// class = property+function
class mainMap {
    var sayi_1=0
    var sayi_2=0

    fun toplam(){
        println("Sayi toplami = ${sayi_1 + sayi_2}")
    }
    fun cikarma(){
        println("Sayi cikarma = ${sayi_1 - sayi_2}")
    }
    fun carpma(){
        println("sayi carpimi= ${sayi_1*sayi_2}")
    }
    fun bolme(){
        var sonuc=sayi_1.toDouble()/sayi_2.toDouble()
        println("sayi carpimi= ${sonuc.toString()}")
    }
}