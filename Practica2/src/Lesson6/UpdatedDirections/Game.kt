package Lesson6.UpdatedDirections

class Game {
    private val path = mutableListOf(Directions.START)
    private val location = Location()

    private val moveNorth = {
        path.add(Directions.NORTH)
        location.updateLocation(Directions.NORTH)
        true
    }

    private val moveSouth = {
        path.add(Directions.SOUTH)
        location.updateLocation(Directions.SOUTH)
        true
    }

    private val moveEast = {
        path.add(Directions.EAST)
        location.updateLocation(Directions.EAST)
        true
    }

    private val moveWest = {
        path.add(Directions.WEST)
        location.updateLocation(Directions.WEST)
        true
    }

    private val moveEnd = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        val continueGame = where()
        if (!continueGame) isRunning = false
    }

    fun makeMove(direction: String?) {
        when (direction?.lowercase()) {
            "n" -> move(moveNorth)
            "s" -> move(moveSouth)
            "e" -> move(moveEast)
            "w" -> move(moveWest)
            else -> move(moveEnd)
        }
    }

    var isRunning: Boolean = true
}
