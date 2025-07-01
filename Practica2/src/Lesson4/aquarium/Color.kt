package Lesson4.aquarium

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

sealed class Spice(
    val name: String,
    val spiciness: String = "mild",
    val color: SpiceColor
) {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            else -> 0
        }

    abstract fun prepareSpice()
}

interface Grinder {
    fun grind() {
        println("Grinding the spice...")
    }
}

class Curry(spiciness: String) : Spice("Curry", spiciness, YellowSpiceColor), Grinder {
    override fun prepareSpice() {
        grind()
        println("Preparing curry with spiciness: $spiciness and color: ${color.color}")
    }
}
