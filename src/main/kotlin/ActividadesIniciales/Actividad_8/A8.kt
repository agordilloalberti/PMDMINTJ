package ActividadesIniciales.Actividad_8

import java.util.Scanner

fun main(){

    val i = Inventario()
    val sc = Scanner(System.`in`)
    var op:String

    do {
        println("¿Que desea hacer?\n1.Añadir un objeto\n2.Eliminar un objeto\n3.Visualizar el inventario\n0.Salir")
        op=sc.nextLine()
        when (op){

            "1" -> {
                println("Introduzca el nombre del objeto a añadir")
                println(i.addItem(sc.nextLine().lowercase()))
            }

            "2"->{
                println("Introduzca el nombre del objeto a borrar")
                println(i.removeItem(sc.nextLine().lowercase()))
            }

            "3"-> println(i.showInventory())

            "0"-> println("Adios")

            else -> println("Opcion no valida, reintentelo\n")
        }
    }while (op!="0")
}

