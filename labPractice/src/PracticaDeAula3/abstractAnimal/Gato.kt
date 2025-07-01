package abstractAnimal

class Gato(nombre: String): Animal(nombre) {
    override fun hacerSonido() {
        println("El $nombre hace miau.")
    }

    override fun moverse() {
        println("El $nombre hace corre.")
    }
}