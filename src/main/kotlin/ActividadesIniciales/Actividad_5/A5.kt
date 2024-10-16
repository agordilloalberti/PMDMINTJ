package ActividadesIniciales.Actividad_5

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    println("Introduzca el nivel de su personaje")
    val nivel = sc.nextInt()

    if (nivel<=0){
        println("Nivel no valido")
    }else if (nivel<10){
        println("Personaje principiante")
    } else if (nivel in 10..<20){
        println("Personaje intermedio")
    } else{
        println("Personaje avanzado")
    }
}