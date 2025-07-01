package FigurasGeometricas1

import FigurasGeometricas.FiguraGeometrica

fun main(){
    val cuadrado1 = Cuadrado("Cuadrado", 4.2)
    val circulo1 = Circulo("Circulo", 5.7)

    var figura: List<FiguraGeometricas> = listOf(circulo1, cuadrado1)

    for (element in figura) {
        element.imprimirNombre()
        println("Área del cuadrado: ${element.calcularArea()}")
    }
}