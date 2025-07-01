package PracticaDeAula3.ComportamientoAnimal
import abstractAnimal.Pajaro
import abstractAnimal.Perro

fun AnimalComportamiento(animal: abstractAnimal.Animal){
        when(animal) {
            is Pajaro -> println("Este animal vuela alto.")
            is Perro-> println("Este animal es el mejor amigo del hombre.")
            else -> println("Este animal tiene un comportamiento interesante.")
        }
}