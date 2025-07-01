package Lesson6.Directions

class SimpleGame {
    var path = mutableListOf(DirectionsGame.START)

    val north = { path.add(DirectionsGame.NORTH) }
    val south = { path.add(DirectionsGame.SOUTH) }
    val east = { path.add(DirectionsGame.EAST) }
    val west = { path.add(DirectionsGame.WEST) }

    val end = {
        path.add(DirectionsGame.END)
        println("Game Over: $path")
        path.clear()
        false
    }
}