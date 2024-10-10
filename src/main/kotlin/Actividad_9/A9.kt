package Actividad_9

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    println("Introduzca su nombre")
    val prota = Character(sc.nextLine())
    var op:String

    do {
        println("¿Que desea hacer?\n1.Combatir\n2.Comprobar el progreso de xp\n0.Salir")
        op=sc.nextLine()

        when (op){

            "1" -> println("\n"+prota.combate())
            "2" -> println("\n"+prota.checkXP())
            "0" -> println("\nAdios")
        }
    } while (op!="0")

}