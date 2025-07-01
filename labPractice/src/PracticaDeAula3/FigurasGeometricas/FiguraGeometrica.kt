package FigurasGeometricas

open class FiguraGeometrica(var nombre: String){
     fun imprimirNombre(){
        println("Soy una figura: $nombre")
    }
}

class circulo(nombre: String, var radio: Double): FiguraGeometrica(nombre)

class cuadrado(nombre: String, var lado: Double): FiguraGeometrica(nombre)