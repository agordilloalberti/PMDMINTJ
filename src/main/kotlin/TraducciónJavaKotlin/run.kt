package TraducciónJavaKotlin

import kotlin.time.times

fun main(){

}

fun ej1(){
    /**
     * En kotlin las variable se definen con la palabra reservada "var" mientras que
     * los valores fijos se definen con la palabra "val", a diferencia de en java que
     * se necesita indicar "final" antes del tipo de dato, asi mismo,
     * en java se debe indicar de forma obligatorio el tipo de dato
     * no como en kotlin que asume el tipo de dato segun el valor dado
     */
    val vida = 100
    val personaje = "Naruto"
    println("El personaje $personaje tiene $vida puntos de vida")
}

fun ej3(){
    /**
     * En kotlin, los bucles "for-each" se forman con la palabra reservada "in"
     * y, al igual que en el caso de las variables, no es necesario indicar el
     * tipo de dato que recive la variable ya que lo asume, al contrario java obliga
     * a la especificación del tipo de dato junto a una sintaxsis menos intuitiva
     */
    val cofres = arrayOf("Espada","Escudo","Poción")
    for (cofre in cofres){
        println("Has encontrado $cofre ")
    }
}

fun ej5(){
    /**
     * En kotlin el constructor esta implicito dentro de los atributos que se añaden
     * en los parentesis antes de las llaves, si se busca acceder a estos se les debe de especificar con
     * "var" o "val" si estos no van a ser modificados, java, en cambio, se debe crear un constructor
     * especifico
     */
    class Personaje(
        private var nombre:String,
        private var vida:Int,
        private var ataque:Int
    ){

        fun mostrarInfor(){
            println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
        }
    }

    val goku = Personaje("Goku",100,50)
    goku.mostrarInfor()
}

fun ej7(){
    /**
     * (Nota para el profe: no se de lambdas en genral asi que esto van a sr triples y conjeturas para hacero real)
     * Las lambdas en java son mas complejas de obtener al necesitar que la varible tenga un tipo de dato
     * por culpa de este hecho se debe crear una clase o interfaz para darle ese tipo de dato,
     * en kotlin, al omitir este hecho se es capaz de crear lambdas sin la necesidad de un recurso externo
     */
    fun multiplicar(num:Int): Int {
        return num*2
    }

    println(multiplicar(5))
    var operacion: (Int,Int) -> Int = {x,y -> x + y}
    println(operacion(3,4))
}

fun ejercicioFinal(){
    class Personaje(
        var nombre:String,
        var vida:Int,
        var ataque:Int
    )

    val goku = Personaje("Goku",100,20)
    val vegeta = Personaje("Vegeta",80,25)
    println("Vida de Goku: ${goku.vida}")
    println("Vida de Vegeta: ${vegeta.vida}")

    while (goku.vida>0 && vegeta.vida>0){
        goku.vida-=vegeta.ataque
        vegeta.vida-=goku.ataque

        println("Vida de Goku: ${goku.vida}")
        println("Vida de Vegeta: ${vegeta.vida}")
    }

    if (goku.vida<=0){
        println("Ha ganado Vegeta")
    }else{
        println("Ha ganado Goku")
    }
}