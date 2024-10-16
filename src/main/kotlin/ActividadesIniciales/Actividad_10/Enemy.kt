package ActividadesIniciales.Actividad_10

class Enemy(var nombre:String) {
    var health=500
    var alive=true

    fun takeDmg(dmg:Int):String{
        health-=dmg
        if (alive) {
            if (health <= 0) {
                alive = false
                return "El enemigo $nombre recibe $dmg de daño y ha  muerto"
            }
            return "El enemigo $nombre ha recibido $dmg de daño\n"
        }
        return "El enemigo $nombre recibe una patada en su cadaver por si acaso"
    }
}