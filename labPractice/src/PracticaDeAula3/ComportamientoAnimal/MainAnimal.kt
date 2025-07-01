package PracticaDeAula3.ComportamientoAnimal

import abstractAnimal.Gato
import abstractAnimal.Pajaro
import abstractAnimal.Perro

fun main() {
    val perro = Perro("Max")
    val gato = Gato("Luna")
    val pajaro = Pajaro("Piolín")

    val animales = listOf(perro, gato, pajaro)

    for (animal in animales) {
        animal.hacerSonido()
        animal.moverse()
        AnimalComportamiento(animal)
    }
}
