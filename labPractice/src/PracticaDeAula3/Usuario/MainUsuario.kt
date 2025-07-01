package Usuario

fun main() {
    // Caso 1: Creación exitosa con el constructor primario
    val usuario1 = Usuario("juan123", "juan123@gmail.com")
    println("Usuario 1 → Username: ${usuario1.userName}, Email: ${usuario1.email}")

    // Caso 2: Creación exitosa con el constructor secundario
    val usuario2 = Usuario("ana456")
    println("Usuario 2 → Username: ${usuario2.userName}, Email: ${usuario2.email}")

    // Caso 3: Intento de creación con username vacío (lanzará una excepción)
    try {
        val usuario3 = Usuario("", "email@example.com")
    } catch (e: IllegalArgumentException) {
        println("Error al crear Usuario 3 → ${e.message}")
    }

    // Caso 4: Intento de creación con un email inválido (lanzará una excepción)
    try {
        val usuario4 = Usuario("pepe", "emailinvalido")
    } catch (e: IllegalArgumentException) {
        println("Error al crear Usuario 4 → ${e.message}")
    }
}