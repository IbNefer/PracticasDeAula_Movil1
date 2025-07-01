package Lesson3

fun main(){
    whatShouldDo("sad")
    if(whatShouldDoMejorado(
            temperature1 = TODO(),
            weather1 = TODO(),
            myMood = TODO()
        ) == true) {
        println("A beautifull day await you")
    }else{
        println("You're in trouble my guy.")
    }

}

fun whatShouldDo(mood: String){
    println("What is your mood today (happy, grumpy, sad, joyfull, gratitude.")

    var weather: String = "Sunny"
    var temperature: Int = 24

    when{
        mood == "happy" && weather == "Sunny" -> println("Go for a walk." )
        mood == "sad" && weather == "Sunny" -> println("Read some books.")
        mood == "joyfull" && weather == "Sunny" -> println("Read some books.")
        else -> print("What is your mood")
    }

}

fun whatShouldDoMejorado(temperature1: Int = 22, weather1: String, myMood: String, ):Boolean {

    fun temperature(temperature1: Int) = temperature1 > 25
    fun weather(weather1: String) = weather1 == "sunny"
    fun mood1(myMood: String) = myMood == readLine()?.toString()

    return when {
        temperature(temperature1) -> true
        weather(weather1) -> true
        mood1(myMood) -> true
        else -> false
    }

}