package Actividad_8

fun main(){

    val i = Inventario()

    println(i.addItem("Espada"))
    println(i.addItem("Escudo"))
    println(i.addItem("Hacha"))

    println(i.showInventory())

    println(i.removeItem("Hacha"))

    println(i.showInventory())
}

