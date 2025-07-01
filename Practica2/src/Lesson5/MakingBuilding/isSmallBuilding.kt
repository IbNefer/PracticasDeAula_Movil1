package Lesson5.MakingBuilding

fun <T : BaseBuilding> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}
