package Lesson6.UpdatedDirections

import kotlin.math.max
import kotlin.math.min

class Location(val width: Int = 4, val height: Int = 4) {
    private val map = Array(width) { Array(height) { "Unknown" } }
    var x = 0
    var y = 0

    init {
        // Example descriptions for each location
        for (i in 0 until width) {
            for (j in 0 until height) {
                map[i][j] = "You're at position [$i][$j]"
            }
        }
    }

    fun updateLocation(direction: Directions) {
        when (direction) {
            Directions.NORTH -> y = max(0, y - 1)
            Directions.SOUTH -> y = min(height - 1, y + 1)
            Directions.EAST  -> x = min(width - 1, x + 1)
            Directions.WEST  -> x = max(0, x - 1)
            else -> {}
        }
        println(map[x][y])
    }
}
