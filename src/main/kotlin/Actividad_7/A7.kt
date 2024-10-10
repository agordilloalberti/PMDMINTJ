package Actividad_7

fun main(){

    var c1 = Character("A",10.0,10.0)
    var c2 = Character("B",20.0,4.5)

    println(c1.attack(c2))
    println(c1.attack(c2))
    println(c1.attack(c2))
    println(c2.attack(c1))

    println(c1);
    println(c2)
}