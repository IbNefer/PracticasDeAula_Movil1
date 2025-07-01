package MyOpenAquarium

fun main(){
    buildAquarium1()
}

fun buildAquarium1(){
    val aquarium= OpenAquarium(length = 25, width = 25, height = 40)
    aquarium.printSize()

    var myTowerTank = TowerTank(50, 34)
    myTowerTank.printSize()
}