package FigurasGeometricas1

open class FiguraGeometricas(var nombre: String){
    open fun imprimirNombre(){
        println("Soy una figura: $nombre")
    }
    open fun calcularArea(): Double{
        return 0.0
    }
}

class Circulo(nombre: String, var radio: Double) : FiguraGeometricas(nombre) {
    override fun calcularArea(): Double {
        return 3.14 * radio * radio
    }
}

class Cuadrado(nombre: String, var lado: Double) : FiguraGeometricas(nombre) {
    override fun calcularArea(): Double {
        return  lado * lado

    }
}