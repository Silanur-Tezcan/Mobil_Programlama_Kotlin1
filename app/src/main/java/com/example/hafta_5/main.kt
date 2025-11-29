package com.example.hafta_5
fun main(){
    var user_1= user()

    user_1.setUser_Name("ahmet")
    user_1.user_surname="tezcan"
    user_1.user_age=23

    user_1.showInfo()
    println("---------------------------------")
    println("user name= ${user_1.getUsername()}")
    // 4 temel işlemi sayi_ ve sayi_2 property üzerinden
    //gerçekleştiren bir class
    var sonuc= mainMap()
    sonuc.sayi_1=15
    sonuc.sayi_2=4
    sonuc.toplam()
    sonuc.carpma()
    sonuc.cikarma()
    sonuc.bolme()
println("-------------------------------------")
    var student_1= students()
    student_1.setUser_Name("ahmet")
    student_1.user_surname="duru"
    student_1.user_age=22
    student_1.vize=40
    student_1.final_not=90
    student_1.notHesapla()
println("------------------------------------")
    student_1.student_number=503005 // atama işlemi aslında set işlemidir.
    student_1.showInfo() // ekrana yazdırma işlemi de get işlemidir.
    user_1.showInfo()
println("--------------------------------------------------")
    // abstract class lardan instance türetilemez
    //var my_new_user= newUser()
    // abstract sadece miras almak için oluşturulur
    // bu nedenle, abstract classın kednisinden

    var my_new_student_1= NewStudents()

    my_new_student_1.setAllProperties("sila","tezcan",22)
    my_new_student_1.student_number=135
    // abstract örneği
    my_new_student_1.newShowInfo()
    //polymorphism örneği
    my_new_student_1.belong_class()

}
