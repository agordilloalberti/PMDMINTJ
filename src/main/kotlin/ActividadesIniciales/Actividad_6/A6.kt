package ActividadesIniciales.Actividad_6

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    println("Introduzca el daño")
    val dmg = sc.nextInt()
    println(combate(dmg))
}

fun combate(dmg:Int): String{
    if (dmg<50){
        return "Golpe normal, $dmg de daño inflingido"
    }
    return "!Golpe critico¡  ${dmg*2} de daño inflingido"
}