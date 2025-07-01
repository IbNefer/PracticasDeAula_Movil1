package EmpleadosINIT

fun main(){
    val gerente = Gerente(400.0, 20000.0, 40, "Michael")
    val desarollador = Desarollador("kotlin", "Andrea", 40, 10000.0)

    var myEmployes: List<Empleado> = listOf(gerente, desarollador)

    for (element in myEmployes){
        element.empleadoInformacion()
        element.calcularSalario()
    }
}