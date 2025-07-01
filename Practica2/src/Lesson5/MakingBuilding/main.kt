package Lesson5.MakingBuilding


fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build() // Output: 400 Wood required

    val brickBuilding = Building(Brick())
    brickBuilding.build() // Output: 800 Brick required
}
