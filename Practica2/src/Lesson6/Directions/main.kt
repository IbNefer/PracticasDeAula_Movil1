package Lesson6.Directions

fun main() {
    val game = SimpleGame()

    println(game.path)

    game.north()
    game.south()
    game.east()
    game.west()
    game.end()

    println(game.path)
}