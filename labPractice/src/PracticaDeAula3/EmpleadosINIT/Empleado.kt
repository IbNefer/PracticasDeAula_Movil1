package EmpleadosINIT

open class Empleado(var salarioBase: Double, var edad: Int, var nombre: String) {
    init {
        println( "Se ha registrado un nuevo empleado: $nombre")
    }

    open fun empleadoInformacion(){
        println("El empleado $nombre, de $edad, tiene un salario de $salarioBase.")
    }

    open fun calcularSalario(): Double{
        return salarioBase
    }
}

