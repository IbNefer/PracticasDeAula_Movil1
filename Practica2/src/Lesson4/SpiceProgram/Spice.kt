package Lesson4.SpiceProgram

/*
class Spice {

    var spices = "curry"
    var spiciness = "mild"

    var heat: Int = 0
        get() = when(spiciness) {
                "mild" -> 5
                "medium" -> 7
                "hot" -> 10
                else -> 1
            }
}
*/

class Spice (val spice: String, val spiciness: String = "mild" ){
    val heat: Int
        get() = when(spiciness){
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            else -> 0
        }

    init {
        println("Spice created: name = $spice, spiciness = $spiciness, heat = $heat")
    }


}

