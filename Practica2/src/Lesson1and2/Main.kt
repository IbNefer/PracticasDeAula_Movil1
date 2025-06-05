package Lesson1and2
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {

    fishquantity()
    rainbowColor()
    withNull()
    nullList()
    nullIncrement()

}



fun fishquantity() {
    val fish1: Int = 2
    val fish2: Int = 71
    val fish3: Int = 233

    val deadFish: Int = 13

    // sumar la cantidad total de pezes y restar la cantidad que comio

    var fish = fish1 + fish2 + fish3 - deadFish
    println("La cantidad restante de pezes es $fish.")


    // Cantidad de pezes por aquarium
    var fish4 = fish / 30
    println("Cada aquarium llevara minimo $fish4")
}

fun rainbowColor() {
    var rainbowColor: String? = "Blue"
    rainbowColor = "Red"

    println("The rainbow is $rainbowColor")


    /*
     Retorna un error, pero es parte del ejercicio
     val blackColor: String = "Black"
     blackColor = "Violet"
     println("Black color is $blackColor")
    */
}

fun withNull() {
    var rainbowColor: String? = null

    var blueCorlor: String? = null
    var greenColor = null
}

fun nullList() {
    listOf(null, null)

    val list: List<Nothing?> = listOf(null, null)
    val list1: List<Nothing?> = emptyList()

}

fun nullIncrement() {
    var nullTest: Int? = null
    println(nullTest?.inc() ?: 0)
}