package Actividad_9

class Character(val nombre:String) {
    private var nivel = 1
    private var xp = 0

    fun combate():String{
        val cxp =(Math.random()*100).toInt()
        xp+=cxp
        var s = ""
        if (xp>=200){
            s+=subirNivel()
        }
        return "El personaje $nombre ha ganado $cxp de xp \n$s"
    }

    private fun subirNivel():String{
        xp-=200
        nivel++
        return "$nombre ha subido al nivel $nivel\n"
    }

    fun checkXP():String{
        return "El personaje $nombre tiene $xp y le faltan ${200-xp} de xp para llegar al nivel ${++nivel}\n"
    }
}