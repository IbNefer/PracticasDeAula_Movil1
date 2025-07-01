package Lesson4.SpiceAgain

internal abstract class SpiceNew (val spice: String, val spiciness: String = "mild" ) {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            else -> 0
        }

    init {
        println("Spice created: name = $spice, spiciness = $spiciness, heat = $heat")
    }

    abstract fun prepareSpice()

}
