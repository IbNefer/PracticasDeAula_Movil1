package PracticaClasesObjetos.AbstractAquarium

abstract class AbstractBuilder {
    abstract val color: String
}

class plestocomus : AbstractBuilder(), FishAction{
    override val color: String = "gold"
    override fun eat() {
        println("Eat algae")
    }
}

class shark: AbstractBuilder(), FishAction{
    override val color: String = "Grey"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

interface FishAction{
    fun eat()
}