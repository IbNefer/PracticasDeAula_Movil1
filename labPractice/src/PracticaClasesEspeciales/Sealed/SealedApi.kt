package Sealed

sealed class SealedApi{
    data class Exito(var Datos: String): SealedApi()
    data class Error(var mensaje: String): SealedApi()
    object cargando: SealedApi()
}


fun procesarResultados(resultado: SealedApi){
    when(resultado){
        is SealedApi.Exito -> println("Exito: Datos recibidos -> ${resultado.Datos}" )
        is SealedApi.Error -> println("Error: Datos no recibidos -> ${resultado.mensaje}")
        SealedApi.cargando -> println("Se esta cargando los datos")
    }
}