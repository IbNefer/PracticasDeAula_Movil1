package ComportamientoAnimal

abstract class Animal(var nombre: String) {
    abstract fun hacerSonido()
    abstract fun moverse()
}