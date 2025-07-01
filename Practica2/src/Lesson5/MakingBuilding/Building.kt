package Lesson5.MakingBuilding

class Building<T : BaseBuilding>(val buildingMaterial: T) {

    private val baseMaterialsNeeded = 100

    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build() {
        println("${actualMaterialsNeeded} ${buildingMaterial::class.simpleName} required")
    }
}
