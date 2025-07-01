package EmpleadosINIT

class Gerente(var bono: Double, salarioBase: Double, edad: Int, nombre: String): Empleado(salarioBase, edad, nombre) {

    override fun calcularSalario(): Double {
        return salarioBase + bono
    }

}