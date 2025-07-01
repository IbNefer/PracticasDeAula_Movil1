package Notification

class NotificacionSMS(val numero: String) : Notificacion() {
    override fun enviar() {
        println("Enviando SMS al número $numero")
    }
}

