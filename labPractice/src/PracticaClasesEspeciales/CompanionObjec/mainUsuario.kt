package PracticaClasesEspeciales.CompanionObjec

fun main(){
    crearUsuario()
}

fun crearUsuario(){
    println("___Put your email here: ____")
    val usuario1 = Usuario.crearDesdeEmail(readln())
    println(usuario1)
}