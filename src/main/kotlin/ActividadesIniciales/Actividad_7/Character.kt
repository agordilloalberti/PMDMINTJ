package ActividadesIniciales.Actividad_7

class Character(val nombre: String, var vida:Double, var ataque: Double, var vivo: Boolean = true) {

    fun attack(c: Character):String{
        var s = ""
        if (vivo) {
            if (c.vivo) {
                s += c.receiveDamage(this.ataque)
                return "El combatiente $nombre ataca a ${c.nombre} por $ataque de daño\n" + s
            }
            return "El combatiente ${c.nombre} ya ha caido"
        }
        return "El combatiente $nombre intenta atacar pero esta incapacitado"
    }

    private fun receiveDamage(dmg: Double):String{
        this.vida-=dmg
        if (vida<=0){
            vivo=false
            return "El combatiente $nombre ha sido derrotado"
        }
        return "El combatiente $nombre ha recivido $dmg de daño"
    }

    override fun toString(): String {
        return "Character(vida=$vida, ataque=$ataque, vivo=$vivo)"
    }


}