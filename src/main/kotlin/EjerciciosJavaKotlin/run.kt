package EjerciciosJavaKotlin

import Ayudas
import java.lang.Exception
import kotlin.math.pow
import kotlin.math.roundToInt

private fun main(){
    ej12()
}

fun ej1(){
    println("Por favor escriba su nombre:")
    val sc = Ayudas.sc
    val nombre = sc.nextLine()
    println("¡Hola, $nombre!")
}

fun ej2(){
    println("Indique un número para comprobar si es par")
    val sc = Ayudas.sc
    val e = sc.nextLine()

    try {
        val num = e.toInt()
        if (num%2==0){
            println("El número $num es par")
        }else{
            println("El número $num no es par")
        }
    }catch(e : Exception){
        println("Debe introducir un número entero")
    }
    println("Fin")
}

fun ej3(){
    println("Introduzca el radio de su circulo")
    val sc = Ayudas.sc
    val radioS = sc.nextLine()
    try {
        val radio = radioS.toDouble()
        val res = Ayudas.round(Math.PI* radio.pow(2),2)
        println("El área de su circulo es: $res\nFin")
    }catch (e:Exception){
        println("Debe introducir un número\nFin")
    }
}

fun ej4(){
    val num = (Math.random()*100).roundToInt()
    println("Se ha generdo un número del 1 al 100 intente adivinarlo")
    var op : Int?
    var input :String
    val sc = Ayudas.sc
    do {
        input = sc.nextLine()
        try {
            op = input.toInt()
            if (op>num){
                println("El número es mas pequeño")
            }else if (op<num){
                println("El número es mas grande")
            }
        }catch (e:Exception){
            println("Introduzca un número")
            op=-1
        }
    }while (op!=num)
    println("Exacto el número era $num, enhorabuena ¡has ganado!")
}

fun ej5(){
    println("Introduzca el número del que desea saber la tabla de multiplicar")
    val sc = Ayudas.sc
    val numS = sc.nextLine()
    try {
        val num = numS.toInt()
        for (i in 1..10){
            println("$num por $i es ${num*i}")
        }
    }catch (e:Exception){
        println("Debe introducir un número entero")
    }
    println("Fin")
}

fun ej6(){
    println("Se van a sumar todos los números del 1 al 100")
    var sum =0
    for (i in 1..100){
        sum += i
    }
    println("El total es $sum")
}

fun ej7(){
    println("Introduzca una cadena de caracteres para imprimirla revertida")
    val sc = Ayudas.sc
    val s = sc.nextLine()
    var sAround =""

    for (i in s.length-1 downTo 0){
        sAround += s[i]
    }
    println("La cadena original era: \"$s\", invertida queda asi: \"$sAround\"")
}

fun ej8(){
    println("Introduzca una cadena de caracteres para contar las vocales")
    val sc = Ayudas.sc
    val input = sc.nextLine()
    val vocales = listOf('A','E','I','O','U')
    var cont = 0
    for (i in input.uppercase()){
        if (i in vocales){
            cont++
        }
    }
    println("La cadena $input tiene un total de $cont vocales")
}

fun ej9(){
    println("Introduzca un número para comprobar si este es primo")
    val sc = Ayudas.sc
    val input = sc.nextLine()
    try {
        val num = input.toInt()
        var primo = true
        if (num>2){
            for (i in 2..<num){
                if (num%i==0){
                    primo = false
                    break
                }
            }
        }
        if (primo){
            println("El número $num es primo")
        } else{
            println("El número $num no es primo")
        }
    }catch (e:Exception){
        println("Tiene que introducir un número entero")
    }
    println("Fin")
}

fun ej10(){
    var o : Char
    val sc = Ayudas.sc
    do {
        println("Debe elegir uno de los dos tipos de conversión admitidos, de Celsius a Fahrenheit (F) o viceversa (C)")
        o = sc.nextLine().uppercase()[0]
    }while(o!='F' && o!='C')
    println("Indique los grados $o")
    val gradosS = sc.nextLine()
    try {
        val r :Double
        val grados = gradosS.toDouble()

        if (o=='C'){
            r=(grados-32)*(5/9)
        }else{
            r=grados*9/5+32
        }
        println("La temperatura en grados $o es de $r")
    }catch (e:Exception){
        println("Debe introducir un número")
    }
    println("Fin")
}

fun ej11(){
    println("Introduzca la cantidad de números de la secuencia de fibonacci que desea obtener")
    val sc=Ayudas.sc
    val nS = sc.nextLine()
    try {
        val n = nS.toInt()
        var r = "0,1"
        for (i in 0..n){
            val arr = r.split(",")
            r+=",${arr.last().toInt()+arr[arr.lastIndex-1].toInt()}"
        }
        println("Aqui tiene $n números de la secuencia de fibonacci: \n$r")
    }catch (e:Exception){
        println("Debe introducir un número entero")
    }
    println("Fin")
}

fun ej12(){
    println("Introduzca una secuencia de números para imprimirla revertida")
    val sc = Ayudas.sc
    val s = sc.nextLine()
    var sAround =""

    for (i in s.length-1 downTo 0){
        sAround += s[i]
    }
    println("La secuencia original era: \"$s\", invertida queda asi: \"$sAround\"")
}

fun ej13(){
    class Anime(val nombre:String,val episodios: Int,val genero:String){
        override fun toString(): String {
            return "El nombre del anime es: $nombre, pertenece al genero $genero y tiene $episodios episodios "
        }
    }

    val sc = Ayudas.sc
    println("Introduzca el nómbre del anime")
    val nombre = sc.nextLine()
    println("Introduzca el número de episodios del anime")
    val episodios = sc.nextInt()
    println("Introduzca el genero del anime")
    val genero = sc.nextLine()

    val a = Anime(nombre,episodios,genero)
    println(a)
}

fun ej14(){
    class Videojuego(
        val titulo:String,
        val plataforma:String,
        val horasJugadas:Double
    ){
        override fun toString(): String {
            return "El juego: $titulo, esta disponible en $plataforma y llevas $horasJugadas horas jugadas"
        }
    }

    val inventario = mutableListOf<Videojuego>()
    var op :String
    val sc = Ayudas.sc
    do {
        println("¿Que desea hacer?\n 1.Añadir un juego.\n2.Eliminar un juego.\n3.Mostrar el inventario.\n0.Salir")
        op=sc.nextLine()
    }while (op!="0")
}