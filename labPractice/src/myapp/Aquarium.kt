package myapp

class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 60) {
    init {
        println("Initializing aquarium.")
    }

    val volume: Int
        get() = width * height * length /1000


    fun size(){
        println("The width is: $width.\n" +
                "The height is: $height. \n"+
                 "The length is: $length. \n")

        println("The volume is: $volume")
    }

    constructor(numberOfFish: Int): this(){
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

}

