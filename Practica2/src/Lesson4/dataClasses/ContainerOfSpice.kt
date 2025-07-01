package Lesson4.dataClasses

data class ContainerOfSpice(val spice: DataSpice) {
    val label: String
        get() = spice.nameSpice
}
