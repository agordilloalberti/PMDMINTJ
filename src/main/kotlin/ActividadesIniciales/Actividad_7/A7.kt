package ActividadesIniciales.Actividad_7

fun main(){

    var c1 = Character("A", 10.0, 10.0)
    var c2 = Character("B", 20.0, 4.5)
    var w: Character

    while (true){
        println(c1.attack(c2))
        if (!c2.vivo){
            w=c1
            break
        }
        println(c2.attack(c1))
        if (!c1.vivo){
            w=c2
            break
        }
    }
    println("El ganador del combate es ${w.nombre} con ${w.vida} de salud restante")

}