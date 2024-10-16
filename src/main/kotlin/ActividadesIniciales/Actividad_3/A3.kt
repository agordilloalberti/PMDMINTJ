package ActividadesIniciales.Actividad_3

fun main(){
    var dmg=3
    for (i in 1..3){
        println(dmg)
        dmg= multiplicarAtaques(dmg)
    }
    println(dmg)
}

fun multiplicarAtaques(dmg:Int): Int {
    return dmg*5;
}