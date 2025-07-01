package Lesson3
/*
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid.Companion.random
@OptIn(ExperimentalUuidApi::class)

fun Lesson1and2.Lesson3.Lesson3.Lesson3.Lesson3.Lesson3.Lesson3.Lesson3.Lesson3.main(){
    val random1 = random().toString()
    val random2 = {random().toString()}

    println(random1)
    println(random2)

}
 */

fun main() {
    val rollDice: (Int, Int) -> Unit = { sides, times ->
        repeat(times) {
            println((1..sides).random())
        }
    }

    rollDice(12, 3)

    fun gamePlay(rollDice1: Int){
        println("It will roll $rollDice1 times.")
        rollDice(12, rollDice1)
    }

    gamePlay(2)
}
