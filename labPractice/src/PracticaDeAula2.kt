fun main(){
    usuario()
    listaTareaPendiente()
    articlePrice()
    defaultSetting()
}

fun usuario(){
    var userName: String? = "Alibaba"
    var userEmail: String? = "alibaba@gmail.com"
    var userBio: String? = null

    println("Name ${userName?: ": no proporcionado"}")
    println("Biografia ${userBio?: ": no proporcionado"}")
    println("Email ${userEmail?: ": no proporcionado"}")

}


fun listaTareaPendiente(){
    var listaPendiente: MutableList<String?> = mutableListOf<String>() as MutableList<String?>
    listaPendiente.add("Kotlin assignment")
    listaPendiente.add("Python assignment")
    listaPendiente.add("Math assignment")
    listaPendiente.add(null)


    for(element in listaPendiente){
        println("The assignment I got is ${element?: "Sin descripcion de la tarea."}.")
    }

    //Getting the first assignment
    println("The first assignment is: ${listaPendiente[0]?: "no assignment."}")

}

fun articlePrice(){
    var arrayArticulo = arrayOf("Huevos", "Papita", "Platano")
    var arrayNullArticulo: Array<Double?> = arrayOf(23.5, 12.0, null)

    var mylist = mutableListOf<Int>(0, 1 ,2)

    for (element in mylist){
        println("El articulo deseado es: ${arrayArticulo[element]}, el precio es de ${arrayNullArticulo[element]?: "no tiene precio"}")
    }

}

fun defaultSetting(){
    fun main() {
        val settingColor: String? = null
        val settingFont: Int? = null

        val actualColorTheme = settingColor ?: "Luz"
        val actualFont = settingFont ?: 12

        println("Tema de aplicación: $actualColorTheme, Tamaño de fuente: ${actualFont}pt.")
    }

}

fun punctuation() {
    val punctuation: List<Int?> = listOf(10, null, 20, 15, null, 30, null, 25)

    var suma = 0

    for (puntuacion in punctuation) {
        if (puntuacion != null) {
            println("Puntuación registrada: $puntuacion")
            suma += puntuacion
        } else {
            println("Intento fallido")
        }
    }

    println("Puntuación total de los intentos registrados: $suma")

    val puntuacionesFiltradas: List<Int> = punctuation.filterNotNull()
    println("Lista de puntuaciones válidas: $puntuacionesFiltradas")
}
