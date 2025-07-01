package Lesson4.dataClasses

fun main() {
    val containerA = ContainerOfSpice(DataSpice("Curry", "spicy"))
    val containerB = ContainerOfSpice(DataSpice("Turmeric", "mild"))
    val containerC = ContainerOfSpice(DataSpice("Pepper", "medium"))

    val containers = listOf(containerA, containerB, containerC)

    // Print out the labels
    for (container in containers) {
        println("The spice is: ${container.label}")
    }
}
