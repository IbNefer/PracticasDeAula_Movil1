fun main(){
    fishConditions()
    fishRange()
    fishCases()
    fishWhen()
    fishMultipleCases()
}

fun fishConditions(){
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants){
        println("Good Ratio!")
    }
    else{
        println("Unhealthy ratio!")
    }
}

fun fishRange(){
    val fish = 50
    if(fish in 1..100){
        println("There are $fish")
    }
}

fun fishCases(){
    val fishNumbers = 50
    if (fishNumbers == 0 || fishNumbers ==50 ){
        println("The number of fish is $fishNumbers.")
    }

}

fun fishMultipleCases(){
    val fish = 67
    if (fish == 0){
        println("The tank is empty.")
    }
    else if (fish < 50){
        println("Got some fishS!")
    }
    else{
        println("That's a lot fish we got there!")
    }
}

fun fishWhen(){
    val fishValue = 43
    when(fishValue){
        0 -> println("The tank is empty.")
        in 1..37 -> println("Some fish!")
        else -> println("You got a lot of fish.")
    }
}