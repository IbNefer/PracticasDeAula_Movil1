package PracticaClasesEspeciales.EnumPrioridad

fun main(){
    println("Colores de cada Nivel de prioridad.")

    for (prioridad in PrioridadTarea.values()){
        val color = obtenerColor(prioridad)
        println("Prioridad: ${prioridad.name}, Color: $color")
    }
}

fun obtenerColor(prioridad: PrioridadTarea): String {
    return prioridad.colorHex
}

