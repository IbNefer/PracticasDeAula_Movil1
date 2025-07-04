package MyOpenAquarium

open class OpenAquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "Rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}

class TowerTank(override var height: Int, var diameter: Int): OpenAquarium(diameter, diameter, height ){
    override var volume: Int
        get() = (width/2 * length/2 * height / 1000 * (3.14)).toInt()
        set(value) {
            height = ((value*1000/(3.14)) / (width/2 * length/2)).toInt()
        }

    override var water: Double = volume * 0.8
    override val shape = "Cylinder"

}