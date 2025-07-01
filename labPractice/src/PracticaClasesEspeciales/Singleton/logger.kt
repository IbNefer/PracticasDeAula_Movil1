import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object Logger {


    private val logs = mutableListOf<String>()

    private val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

    fun log(mensaje: String) {
        val timestamp = LocalDateTime.now().format(formatter)
        val mensajeConFecha = "$timestamp [LOG]: $mensaje"

        // Añade el mensaje con formato al historial interno
        logs.add(mensajeConFecha)

        // Imprime el mensaje en la consola para feedback inmediato
        println(mensajeConFecha)
    }


    fun mostrarLogs() {
        println("\n--- Historial Completo de Logs ---")
        if (logs.isEmpty()) {
            println("No hay logs para mostrar.")
        } else {
            logs.forEach { println(it) }
        }
        println("--- Fin del Historial ---")
    }
}

fun procesarDatos() {
    Logger.log("Iniciando el procesamiento de datos...")

    Thread.sleep(100) // Simular trabajo
    Logger.log("Datos procesados exitosamente.")
}

fun main() {
    Logger.log("Aplicación iniciada.")

    procesarDatos()

    Logger.log("Finalizando la aplicación.")

    Logger.mostrarLogs()
}