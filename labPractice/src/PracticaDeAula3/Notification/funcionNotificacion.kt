package Notification

fun enviarTodas(notificaciones: List<Notificacion>) {
    for (n in notificaciones) {
        n.enviar()
    }
}
