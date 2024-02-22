package com.example.aplikasikotlin

fun main(args: Array<String>) {
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    biodata("Vava Ahsanul K","2A","Magetan")
    hobby("Menonton","Menonton Orang Berkelahi")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
}

fun biodata(nama: String, kelas:String ,Alamat:String){
    val biodata = """
        nama = $nama
        kelas = $kelas 
        Alamat= $Alamat
    """
    print(biodata)
}

fun hobby(nama:String, desc:String){
    println("hobby = $nama")
    println(desc)

}
