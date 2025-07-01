package Lesson4.SpiceProgram

/*
fun Lesson1and2.Lesson3.Lesson3.Lesson3.Lesson3.Lesson3.Lesson3.Lesson3.Lesson3.main(){
    var spice = Spice()

    println("The spice is ${spice.spices} and the spiciness is ${spice.spiciness}.")
    println("We could say the spiciness is ${spice.heat}.")

}
*/

fun main(){
    val mySpice =  listOf(Spice("Cayenne", "mild"),
                                      Spice("Paprika", "spicy" ) ,
                                      Spice("Oregano", "medium"),
                                      Spice("Pepper"),
                                      Spice("chili", "spicy"),
                                      Spice("coriander", "mild"))

    val filterSpices = mySpice.filter{ it.heat <= 3}
    filterSpices.forEach { println("${it.spice} is ${it.spiciness}.")}


}