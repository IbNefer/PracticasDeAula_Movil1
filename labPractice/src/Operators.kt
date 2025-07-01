fun main(){
    val a: Int = 1
    val b: Int = 2

    val c: Int  = a + b
    println("El resultado es $c")
    multiplication()
    multiplicacion1()
    types()
    fishandplants()
}

fun multiplication(){
    val a = 6.0*50
    println("El resultado es $a")
}

fun multiplicacion1(){

    println(2.times(3))
    println(3.5.plus(4))
    println(2.4.div(2))

}

fun types() {

    val age: Int = 7
    val byteAge = age.toByte()
    println(byteAge)
}

/*
Expected to give an error.
    var movie: String = "Lalaland"

    var byteMovie: Byte = b2.toByte()
    println(i1)
*/

fun fishandplants(){
    val numberofFishs = 12
    val numberofPlants = 7

    println("I have $numberofFishs fishs, and " + "$numberofPlants plants.")


}