package Actividad_9

class Character(val nombre:String) {
    var nivel = 1
    var xp = 0

    fun combate():String{
        xp+=50
        var s = ""
        if (xp>=200){
            s+=subirNivel()
        }
        return "El personaje $nombre ha ganado 50 de xp \n$s"
    }

    fun subirNivel():String{
        xp-=200
        nivel++
        return "$nombre ha subido al nivel $nivel"
    }
}