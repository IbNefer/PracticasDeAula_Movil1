package ComportamientoAnimal

class Pajaro(nombre: String): Animal(nombre) {
    override fun hacerSonido() {
        println("El $nombre canta.")
    }

    override fun moverse() {
       println("El $nombre vuela.")
    }
}