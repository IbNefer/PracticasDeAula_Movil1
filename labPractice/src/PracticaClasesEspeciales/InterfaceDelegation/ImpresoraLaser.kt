package PracticaClasesEspeciales.InterfaceDelegation

class ImpresoraLaser: Impresora {
    override fun imprimir(documento: String) {
        println("El documento $documento fue Impresada...")
    }
}