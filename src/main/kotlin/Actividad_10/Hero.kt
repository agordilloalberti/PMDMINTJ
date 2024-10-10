package Actividad_10

class Hero(var nombre:String,var damage:Int) {

    fun attack(e:Enemy):String{
        return "$nombre ataca al enemigo ${e.nombre} por $damage de daño \n${e.takeDmg(damage)}\n"
    }
}