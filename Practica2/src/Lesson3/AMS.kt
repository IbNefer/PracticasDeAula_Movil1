package Lesson3

import java.util.*

fun main(){
    println("Hello, World")
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is today")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    print(when(day){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped."
    })
}

