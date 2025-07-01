package ProductoSegundario

class Producto(var codigo: String, var precio: Double) {
    init {
        if (precio < 0){
            throw IllegalArgumentException("El precio no puede ser negativo")
        }
        println("Precio del articulo: $precio")
        println("Godigo del articuo: $codigo")
    }

    constructor(codigo: String) : this(codigo, 9.99)
    constructor(): this("GEN-001", 12.4)

}