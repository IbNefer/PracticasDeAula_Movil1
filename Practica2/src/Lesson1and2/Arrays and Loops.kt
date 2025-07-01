package Lesson1and2

import kotlin.math.pow

fun main(){
    arrayFun()
    arrayPracticeTime()
}


fun arrayFun(){
    val array = Array (7) {1000.0.pow(it)}
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }
}


fun arrayPracticeTime() {
    val array1 = IntArray(5) { it + 11 }
    val mutablelist = mutableListOf("Paper", "Paprika", "Amour", "Joie", "Folie")

    for ((i, value) in array1.withIndex()) {
        println("${mutablelist[i]}: ${value}")
    }
}



