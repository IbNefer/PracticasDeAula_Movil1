package Usuario

fun main() {
    val usuario1 = Usuario("juan123", "juan123@gmail.com")
    println("Usuario 1 → Username: ${usuario1.userName}, Email: ${usuario1.email}")

    val usuario2 = Usuario("ana456")
    println("Usuario 2 → Username: ${usuario2.userName}, Email: ${usuario2.email}")

    // val usuario3 = Usuario("", "email@example.com")

   // val usuario4 = Usuario("usuarioInvalido") // si cambias la validación a algo más estricta
}