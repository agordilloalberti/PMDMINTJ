package Actividad_10

class Enemy {
    var health=500
    var alive=true

    fun takeDmg(dmg:Int):String{
        health-=dmg
        if (alive) {
            if (health <= 0) {
                alive = false
                return "El enemigo ha recivido $dmg de daño y ha  muerto"
            }
            return "El enemigo ha recivido $dmg de daño\n"
        }
        return "El enemigo recive una patada en su cadaver por si acaso"
    }
}