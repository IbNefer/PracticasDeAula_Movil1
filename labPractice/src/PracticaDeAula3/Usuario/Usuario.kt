// Archivo: Usuario.kt
package Usuario

class Usuario(var userName: String, var email: String) {
    // El bloque init se ejecuta después del constructor primario.
    // Es el lugar ideal para poner la lógica de validación.
    init {
        // CORRECCIÓN 1: Se usa isBlank() para validar que el username no esté vacío o solo contenga espacios.
        if (userName.isBlank()) {
            throw IllegalArgumentException("El username no puede quedar vacío.")
        }
        // CORRECCIÓN 2: Se añade una validación para el email en el bloque init
        // para que se aplique a todos los constructores.
        if (!email.contains("@") || email.isBlank()) {
            throw IllegalArgumentException("El formato del email no es válido.")
        }
    }

    /**
     * Constructor secundario que crea un email por defecto a partir del username.
     * Delega la creación de la instancia al constructor primario.
     */
    // CORRECIÓN 3: El cuerpo de este constructor era innecesario, se ha eliminado.
    // La validación del username y del email generado ya se maneja en el bloque init.
    constructor(username: String) : this(username, "$username@empresa.com")
}