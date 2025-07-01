package PracticaClasesEspeciales.InterfaceDelegation

fun main(){
    implementInterface()
}

fun implementInterface(){
    val impresora1 = ImpresoraLaser()
    val camaPlana = EscanerDeCamaPlana()

    val misImpresoras = Multifunctional(impresora1, camaPlana)

    misImpresoras.imprimir("MiFoto.pdf")
    val Escaneado = misImpresoras.escanear()

    println("El archivo fue recibido por el escaner: $Escaneado")
}