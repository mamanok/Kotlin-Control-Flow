enum class Sembako (val nomor : Int){
    BERAS (1),
    GULA (2),
    SAYUR (3),
    DAGING (4),
    MINYAK (5),
    SUSU (6),
    TELUR (7),
    LPG (8),
    GARAM (9)
}

fun main(args : Array<String>) {
    val sembako = Sembako.BERAS
    println("Value Sembako Name : "+sembako)
    println("Velue Sembako Nomor: "+sembako.nomor)
}