package Usuario

class Usuario(var userName: String, var email: String, ){
    init {
        if (!userName){
            throw IllegalArgumentException("Username no puede quedar vacio.")
        }
    }

    constructor(username: String) : this(username, "$username@empresa.com") {
        if (!email.contains("@")) {
            throw IllegalArgumentException("El email generado no es válido")
        }
    }

}