package abstractAnimal

class Perro(nombre: String): Animal(nombre) {
    override fun hacerSonido() {
        println("El $nombre hace ladra.")
    }

    override fun moverse() {
        println("El $nombre corre.")
    }
}