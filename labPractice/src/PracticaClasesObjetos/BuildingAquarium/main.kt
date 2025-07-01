package BuildingAquarium
fun main(){
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium = BuildAquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}