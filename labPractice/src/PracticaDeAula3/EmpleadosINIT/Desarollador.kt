package EmpleadosINIT

class Desarollador(var lenguaje: String, nombre: String, edad: Int, salarioBase: Double): Empleado(salarioBase, edad, nombre) {
    override fun calcularSalario(): Double {
            return when (lenguaje.lowercase()) {
                "kotlin" -> salarioBase * 2
                "c#" -> salarioBase + 200
                else -> salarioBase + 500
            }
        }
    }