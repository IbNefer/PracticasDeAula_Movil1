package PracticaClasesEspeciales.SealedClass

sealed class ElementoSistema(nombre: String) {
}

class Archivo(Tamaño: Int, nombre: String): ElementoSistema(nombre){

}

class Directorio(nombre: String): ElementoSistema(nombre){
      val mylist = mutableListOf<Int>()
}

object GestorArchivos{
    fun crearArchivos{

    }

    fun crearDirectorios{

    }

}

fun Directorio.calcularTamañoTotal(): Int {
    return this.contenidos.sumOf { elemento ->
        when (elemento) {
            is Archivo -> elemento.tamaño // Caso base: es un archivo, devuelve su tamaño.
            is Directorio -> elemento.calcularTamañoTotal() // Caso recursivo: es un directorio, llama a la misma función.
        }
    }
}