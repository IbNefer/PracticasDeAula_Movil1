package PracticaClasesEspeciales.PairTriple

fun ObtenerDatosUsuarios(): Triple<String, Int, String>{
    val nombreUsuario = "Ale"
    val edad = 19
    val status = "Activado"
    return Triple(nombreUsuario, edad, status)
}