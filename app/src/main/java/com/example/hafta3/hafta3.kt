package com.example.hafta3

import androidx.core.util.rangeTo

fun main(){
    // Basit düzeyde veri tipi tanımlama (2 şekilde tanımlanır)

    // Tanımlama-1: değişkenin veri tipini tanımladan
    val degistirilimez_tip = 15

    var degistirilebilir_tip = "Furkan"
    degistirilebilir_tip = "Ahmet"

    // Tanımlama-2: değişkenin tipini tanımlayarak
    var sayi_1: Int = 15
    var karakter: Char = 'F'

    while (sayi_1>0)
    {
        println("Su anki sayi = $sayi_1")
        sayi_1 = sayi_1 -1
        //sayi_1+=1 = sayi_1 = sayi_1 + 1 = sayi_1++
    }

    println("------------------------------------------------------")

    for (m in 5..10) // (m in 5..10)
    {
        println("m degeri = $m")
    }

    // Kullanıcıdan iki adet tamsayı girişi alınız
    // ilk sayı küçük sayı olacak, ikinci sayı da büyük sayı olacak
    // kullanıcıdan girişini aldığınız bu iki sayı arasında
    // 7'ye ve 2'ye tam bölünen ama 3'e tam bölünmeyen sayıları yazdırınız

    println("Lutfen kucuk sayiyi giriniz: ")
    var sayi_kucuk = readln().toInt()

    println("Lutfen buyuk sayiyi giriniz: ")
    var sayi_buyuk = readln().toInt()

    for(sayi in sayi_kucuk..sayi_buyuk)
    {
        if(sayi%2==0 && sayi%7==0 && sayi%3!=0)
        {
            println("Bolunme kurallarina uygun olan sayi = $sayi")
        }
    }

    println("-----------------------------------------------------")

    // Azalan for döngüsü

    for (i in 10 downTo 1) // (i in 10 downTo 1)
    {
        println("sayi = $i")
    }

    println("-----------------------------------------------------")

    // for döngüsü : son sayının dahil edilmemesi

    for (k in 1 until 5) // (k in 1 until 5)
    {
        println("sayi = $k")
    }

    println("-----------------------------------------------------")

    merhaba()
    toplama(5, 6)

    println("-----------------------------------------------------")

    musteri()

    // 3 parametre alan, 1. ve 2. parametreleri tamsayı olan ve
    // 3. parametresi de tam sayı olan, girilen ilk iki parametreyi
    // yani sayıyı, 3. parametrenin değerine göre matematik işlemine
    // tâbi tutan bir fonksiyon yazınız.
    // örneğin mat_islem(6,13,1) 6 ile 13 sayısını toplayacak
    // 4 temel işlem 1'den 4'e kadar olan sayılarla temsil edilecek

    mat_islemler(15,5,1)

    // for döngüsü ile bu fonksiyonu son parametresi için
    // tüm değerleri çalışacak yani 4 işlemi de yapacak şekilde
    // kullanın/çalıştırın
    println("-----------------------------------------------------")

    for (k in 1..4)
    {
        mat_islemler(15,5,k)
    }

    println("-----------------------------------------------------")

    var sonuc = mat_toplam(8,15)
    println("Sonuc = $sonuc")

    var metin: String = "Burdur Mehmet Akif Ersoy Universitesi"
    println(metin.uppercase())

    println("-----------------------------------------------------")

    println(islem_login("Furkan","123"))

}

// fonksiyon tanımlama-1: parametresiz ve geriye değer döndürmeyen

fun merhaba(){
    println("Bu fonksiyon, parametresiz ve geriye deger dondurmeyen bir fonksiyondur")
}

// fonksiyon tanımlama-2: parametreli ve geriye değer döndürmeyen

fun toplama(a: Int, b: Int){
    println("$a + $b = ${a+b}")
}

// Default parameter Value

fun musteri(kullanici: String="Geçici Kullanıcı"){
    println("Hosgeldiniz Sayin $kullanici")
}

fun mat_islemler(sayi1: Int, sayi2: Int, sayi_islem: Int){
    if(sayi_islem==1)
    {
        println("$sayi1 + $sayi2 = ${sayi1+sayi2}")
    }

    else if(sayi_islem==2)
    {
        println("$sayi1 - $sayi2 = ${sayi1-sayi2}")
    }

    else if(sayi_islem==3)
    {
        println("$sayi1 * $sayi2 = ${sayi1*sayi2}")
    }

    else if(sayi_islem==4)
    {
        println("$sayi1 / $sayi2 = ${sayi1/sayi2}")
    }

    else
    {
        println("Hatalı Değer Girdiniz!!!")
    }
}

fun islem_login(isim: String, sifre: String):String{
    if(isim=="Furkan" && sifre=="123")
    {
        return str_islem()
    }
    return "Basarisiz"
}
// fonksiyon tanımlama-3: parametresiz, geriye değer döndüren
fun str_islem(): String{
    return "Giris Islemi Basarili"
}

// gerçek hayatta, niş bir işi yerine getirmek için tasarlanırlar

// görevi yerine getirdikten sonra başka bir fonksiyonu ya da
// görevi tetiklerler (başka bir fonksiyonu başlatır ya da sonlandırırlar)


// fonksiyon tanımlama-4: parametreli, geriye değer döndüren
fun mat_toplam(a: Int, b: Int):Int{
    return a+b
}