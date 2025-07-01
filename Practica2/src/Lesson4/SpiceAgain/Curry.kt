package Lesson4.SpiceAgain

internal class Curry(spiciness: String) : SpiceNew("Curry", spiciness), Grinder {
    override fun prepareSpice() {
        grind()
        println("Preparing curry with spiciness level: $spiciness")
    }
}

