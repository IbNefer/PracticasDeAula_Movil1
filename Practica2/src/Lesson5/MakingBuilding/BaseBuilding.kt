package Lesson5.MakingBuilding

open class BaseBuilding {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuilding() {
    override val numberNeeded: Int = 4
}

class Brick : BaseBuilding() {
    override val numberNeeded: Int = 8
}


