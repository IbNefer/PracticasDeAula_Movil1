package Lesson3

fun main(){
    getFortune()
}

fun getFortune(){
        val fortuneCookie = listOf<String>("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!")
        var numberofCookie = fortuneCookie.size
        numberofCookie = numberofCookie.toInt()

        var birthdayInput = getBirthday() as Int
        val remainder = birthdayInput?.rem(7) ?: 0
        println("This is the the week you were bor in: ${remainder} ")

        when(remainder){
            1 -> println(fortuneCookie[1])
            2 -> println(fortuneCookie[2])
            3 -> println(fortuneCookie[3])
            4 -> println(fortuneCookie[4])
            else -> println("Put a correct birthdate")
        }
}

fun getBirthday(): Int {
    print("Put your birthday here in the form of an integer: ")
    var birthday: Int = (readLine()?.toInt() ?:print("write it again")) as Int
    return birthday
}