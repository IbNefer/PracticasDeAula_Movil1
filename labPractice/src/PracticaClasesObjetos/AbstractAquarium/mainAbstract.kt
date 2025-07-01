package PracticaClasesObjetos.AbstractAquarium

fun main(){
    makefish()
}

fun makefish(){
    val shark1 = shark()
    val plesto = plestocomus()

    println("Shark ${shark1.color}")
    shark1.eat()

    println("Plestocomus ${plesto.color}")
    plesto.eat()
}