package PracticaClasesEspeciales.CompanionObjec

class Usuario private constructor(Email: String) {
    companion object {
        fun crearDesdeEmail(email: String): Usuario? {
            if (email.contains("@") && email.contains(".")){
                println("Usuario $email se ha creado.")
                return Usuario(email)
                }
            else{
                return null
            }
        }
    }


}