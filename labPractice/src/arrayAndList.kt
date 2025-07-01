import java.util.Arrays.*

fun main(){
    mylist()
    myFirstArray()
    withLoops()
}
fun mylist(){
    val listPersonas = listOf<String>("Pablo", "Diego", "Lenin", "Monteverdi")
    println(listPersonas)

    var listCopy = mutableListOf<String>("Cow", "Goat", "Cats", "Dogs")
    listCopy.remove("Goat")
    println(listCopy)
}

fun myFirstArray(){
    val thisArray = arrayOf("Lalaland", "Mariage", "Amour")
    println(toString(thisArray))

    val numerosYletras = arrayOf("Cielito", 3)
    println(toString(numerosYletras))

    val numeros = intArrayOf(1,2, 3)
    println(toString(numeros))

    val numerosEnteros = intArrayOf(4, 5, 6)
    val combinacion = numeros + numerosEnteros
    println(toString(combinacion))
    println(combinacion[2])

    val otherArray = IntArray(5){it + 100}
    println(toString(otherArray))
}

fun withLoops(){
    val myArray = arrayOf("Igbo", "Songhai", "Mali", "Ife")
    for (i in myArray){
        println("Kingdom of $i")
    }

    for (i in 15..20) print(i)
    for (i in 3..8 step 2) println(i)


    var papitas = 0
    while (papitas < 50){
        papitas++
    }
    println("$papitas papitas que yo comi")

    do {
        papitas--
    }while (papitas > 50)
    println("$papitas papitas que no he comido")

    repeat(2){
        println("Ya he comido")
    }
}