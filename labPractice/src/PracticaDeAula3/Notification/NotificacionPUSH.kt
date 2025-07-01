package Notification

class NotificacionPUSH(val dispositivoId: String) : Notificacion() {
    override fun enviar() {
        println("Enviando notificación push al dispositivo $dispositivoId")
    }
}
