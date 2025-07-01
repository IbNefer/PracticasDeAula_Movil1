fun main(){
    nullTry()
    otherNull()
}

fun nullTry(){
    //val tijera: Int = null, me da un error
    var peces: Int? = null

    var comidaDePeces: Int? = 5
    comidaDePeces = comidaDePeces?.dec()
    println(comidaDePeces)
}

fun otherNull(){
    print("Enter a number")
    var yourNumber = readLine()

    var whatever: Int? = yourNumber?.toIntOrNull()

    whatever = whatever?.inc() ?: 0

    println("The result is $whatever")
}



