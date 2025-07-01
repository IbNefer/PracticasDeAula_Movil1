package Lesson3

fun main(){
    val hours: Int = 15
   if (hours !in 0..23) {
        println("Require the hour in 24h format.")
    } else if (hours < 12) {
        println("Good Morning ")
    }else{
        println("Good Night")
    }
}