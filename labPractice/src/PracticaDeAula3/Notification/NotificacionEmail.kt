package Notification

class NotificacionEmail(val email: String) : Notificacion() {
    override fun enviar() {
        println("Enviando correo electrónico a $email")
    }
}


