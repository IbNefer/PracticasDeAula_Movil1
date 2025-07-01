package Lesson3

import kotlin.random.Random

fun main(){
    getFortuneCookie()
    randomize()
}

fun getFortuneCookie(){
    var i = 0
    do {
        i++
        val fortuneCookie = listOf<String>("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!")
        var numberofCookie = fortuneCookie.size
        numberofCookie = numberofCookie.toInt()

        print("Enter your birthday.")
        var birthday = readLine()
        val birthdayInput = birthday?.toIntOrNull()

        val remainder = birthdayInput?.rem(numberofCookie) ?: 0
        println("This is the reamainder: ${remainder} ")

        when(remainder){
            1 -> println(fortuneCookie[1])
            2 -> println(fortuneCookie[2])
            3 -> println(fortuneCookie[3])
            4 -> println(fortuneCookie[4])
            5 -> println(fortuneCookie[5])
            6 -> println(fortuneCookie[6])
            else -> println("Put a correct birthdate")
        }
    }while (i < 11 || remainder == 5)
}

fun randomize(): String{
    val days = listOf<String>("Sunday", "Monday", "Tuesday", "Wednesday", "Tursday", "Friday", "Saturday")
    return days[Random.nextInt(7)]
}


