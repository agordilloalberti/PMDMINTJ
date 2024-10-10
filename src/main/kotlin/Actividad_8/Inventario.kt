package Actividad_8

class Inventario {
    val inventario = arrayListOf<String>()

    fun addItem(item:String):String{
        inventario.add(item)
        return "Se ha añadido $item al inventario\n"
    }

    fun removeItem(item: String):String{
        inventario.remove(item)
        return "Se ha eliminado $item del inventario\n"
    }

    fun showInventory():String{
        var inv = ""
        for (i in inventario){
            inv+=i+"\n"
        }
        return "El inventario contiene:\n$inv"
    }
}