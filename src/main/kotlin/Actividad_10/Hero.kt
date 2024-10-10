package Actividad_10

class Hero(var nombre:String,var damage:Int) {

    fun attack(e:Enemy):String{
        return "$nombre ataca al enemigo por $damage de daño \n${e.takeDmg(damage)}\n"
    }
}