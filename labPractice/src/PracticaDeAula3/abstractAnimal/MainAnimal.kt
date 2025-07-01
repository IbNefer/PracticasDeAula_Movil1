package PracticaDeAula3.abstractAnimal

import abstractAnimal.Animal
import abstractAnimal.Gato
import abstractAnimal.Pajaro
import abstractAnimal.Perro

fun main(){
    val perro = Perro("Golden Retriever")
    val Siamois = Gato("Siamois")
    val madanSarah = Pajaro("Madan Sara")

    val listaAnimal: List<Animal> = listOf(perro, Siamois, madanSarah)

    for (element in listaAnimal){
        element.moverse()
        element.hacerSonido()
    }
}