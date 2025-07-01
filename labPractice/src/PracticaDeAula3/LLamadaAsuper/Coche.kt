package LLamadaAsuper

class Coche(): Vehiculo() {
    override fun describir() {
        super.describir()
        println("Mas especificamente un vehiculo de 4 ruedas")
    }
}