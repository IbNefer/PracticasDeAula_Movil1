package PracticaClasesEspeciales.Generica

class Caja<T>(val contenido: T){
    fun obtenerContenido(): T? {
        return contenido
    }

    fun estaVacia(): Boolean {
        return contenido == null
    }
}
