package PracticaClasesEspeciales.PairTriple

fun main(){

    val (x, y) = obtenerCoordenadas()

    println("Coordenada X: $x")
    println("Coordenada Y: $y")
    println("La coordenada es ($x, $y)")
    println()

    val (nombreUsuario, edad, status) = ObtenerDatosUsuarios()
    println("El usuario: $nombreUsuario, de edad: $edad esta $status")

}