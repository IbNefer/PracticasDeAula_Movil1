package Lesson4.SpiceAgain

fun main() {
    val mySpiceList = listOf(
        Curry("mild"),
        Curry("spicy"),
        Curry("medium"),
        Curry("spicy"),
        Curry("mild")
    )

    val filterSpices = mySpiceList.filter { it.heat <= 3 }
    filterSpices.forEach { println("${it.spice} is ${it.spiciness}.") }

    println(" Preparing Spices ")
    mySpiceList.forEach { it.prepareSpice() }
}
