package Actividad_10

fun main(){
    val h1 = Hero("Lufirio",10)
    val h2 = Hero("Rofrasio",20)
    val h3 = Hero("Hermundia",15)
    val boss = Enemy()

    while (boss.alive){
        println(h1.attack(boss))
        println(h2.attack(boss))
        println(h3.attack(boss))
    }
}