package Sealed

fun main(){
    llamarSealed()
}

fun llamarSealed(){
    println("--- Caso 1: Éxito ---")
    val resultadoExitoso = SealedApi.Exito("{\"usuario\":\"gema_ai\",\"status\":\"activo\"}")
    procesarResultados(resultadoExitoso)
    println()

    println("--- Caso 2: Éxito ---")
    val resultadoError = SealedApi.Error("{\"usuario\":\"gema_ai\",\"status\"}")
    procesarResultados(resultadoExitoso)
    println()

    println("--- Caso 3: Cargando ---")
    val resultadoCargando = SealedApi.cargando
    procesarResultados(resultadoCargando)
    println()

}