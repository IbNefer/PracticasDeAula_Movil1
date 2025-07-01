fun main(){
    eatFish()
    fishname()

}

fun eatFish() {
    val fish1: String = "trout"
    val fish2 = "haddock"
    val fish3 = "snapper"

    println("I like to eat $fish1 and $fish3 but I dont like $fish2.")

}

fun fishname(){
    val fishName = "haddock"

    when(fishName.length) {
        0 -> println("This is an error.")
        in 3..12 -> println("Good fish name.")
        else -> println("Ok fish name!")
    }
}



