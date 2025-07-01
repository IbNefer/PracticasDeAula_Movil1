package Lesson4.aquarium

fun main() {
    val spices = listOf(
        Curry("mild"),
        Curry("medium"),
        Curry("spicy")
    )

    println("--- Heat and Labels ---")
    spices.forEach {
        println("${it.name} - Spiciness: ${it.spiciness}, Heat: ${it.heat}, Color: ${it.color.color}")
    }

    println("\n--- Preparing Spices ---")
    spices.forEach {
        it.prepareSpice()
    }
}
