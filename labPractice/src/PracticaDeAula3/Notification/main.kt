package Notification

fun main() {
    val emailNotif = NotificacionEmail("usuario@correo.com")
    val smsNotif = NotificacionSMS("+123456789")
    val pushNotif = NotificacionPUSH("Telefono1")

    val listaNotificaciones: List<Notificacion> = listOf(emailNotif, smsNotif, pushNotif)

    enviarTodas(listaNotificaciones)
}
