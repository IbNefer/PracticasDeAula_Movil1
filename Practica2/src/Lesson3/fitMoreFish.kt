package Lesson3

fun main(){
    fitMoreFish()
}

fun fitMoreFish(){
    //The aquarium is a tank that got some fish and decoration
    val tankSize = 14
    var listOfFish = mutableListOf<Int?>(2, 2, 1, 3,2)
    var decorations: Boolean = true
    var fitIn = listOfFish.filterNotNull().sum()

    //Introducing a new fish to be added to the aquarium
    print("Introduce the size of the fish you want to fit in: ")
    val fishSize: Int? = (readLine()?.toInt() ?:print("Write it again!")) as Int

    listOfFish.add(fishSize)
    if (fitIn <= 14) {
        //adding the new fish to my aquarium
        println("Your aquarium got ${listOfFish.filterNotNull().sum()} fishes.")
    }else if(fitIn > 14){
        println("Your tank cant take any more fishes.")
    }
    else{
        println("Do it again, i really dont know what is going on with your aquarium!")
    }


}