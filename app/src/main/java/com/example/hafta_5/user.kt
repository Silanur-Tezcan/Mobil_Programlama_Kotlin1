package com.example.hafta_5

// özellik(property) ve fonksiyonların (functions) bir arada
// mantıklı, hiyerarşik olarak barındırılmasını sağlar.

open class user {
    // degeri boş bırkamayı kabul etmediği içinn bu iki yazı türünü kullanman gerek
    // var user_name: string="furkan" bu kullanımda kotlin diyor ki
    // sen zaten başlangıçta bana bir değişken verdin bunu sonradan null yapmazsın
    private var user_name: String=""
    fun setUser_Name(USERNAME: String){
        user_name=USERNAME
    }
    fun getUsername(): String=user_name


    //yukarıdaki kullanımda ise kotlin diyor ki eğer en başta null
    //degeri alabilcek şekilde bir değğişken tanımlamak istiyorsan o zaman
    // tipin yanına ? simgesi koy ki bunu daha en başta belirt
    var user_surname: String=""
    // encapsulation işlemi, herhangi bir property ye doğrudan erişimin
    // önüne geçmek ve kullanıcıyı kısıtlama getirmek için yapılır
    // tipi yanına ? simgesi koy ki bunu daha en başta belirt
    var user_age: Int=0

    open fun showInfo(){
        println("Name= $user_name, Surname= $user_surname, Age= ${user_age.toString()}")
    }



}