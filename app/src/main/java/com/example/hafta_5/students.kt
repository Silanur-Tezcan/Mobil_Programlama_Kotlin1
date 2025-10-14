package com.example.hafta_5
//Miras alma
// özel bir tanımlama yapmadıysan başka classı miraz alamazsın
// class a open class yapman lazım
class students:user() {
    var student_number: Int = 0
    var lessons=mutableListOf<String>()
    private var user_name: String=""
    var vize=0
    var final_not=0
    // vize nin %40 ile finalin %60 nı hesaplayıp ekrana yazdıran fonksiyon

    fun getSuser_Name(): String= user_name
    fun notHesapla() {
        var islem = (vize * 40.0 / 100) + (final_not * 60.0 / 100)
        var vize_not=(vize * 40.0 / 100)
        var final=(final_not * 60.0 / 100)
        println("vize final not ortalaması: $islem")
        println("vize  notu sonucu: $vize_not")
        println("final notu sonucu: $final")
    }
    override fun showInfo(){
        println("Name=${getUsername()}, Ogrenci No=$student_number")
    }

}