package Lesson6.UpdatedDirections

fun main() {
    val game = Game()

    println("Game started! Your goal is to explore the grid. Type n/s/e/w to move or anything else to quit.")

    while (game.isRunning) {
        print("Enter a direction (n/s/e/w): ")
        val input = readLine()
        game.makeMove(input)
    }

    println("Thanks for playing!")
}
