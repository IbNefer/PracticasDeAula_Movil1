package PracticaClasesObjetos.InterfaceDelegation

class plestocomus :  FishAction, FishColor{
    override val color: String = "gold"
    override fun eat() {
        println("Eat algae")
    }

}

class shark: FishAction, FishColor{
    override val color: String = "Grey"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

interface FishAction{
    fun eat()
}

interface FishColor{
    val color: String
}

object GoldColor: FishColor{
    override val color ="Gold"
}