package PracticaClasesEspeciales.InterfaceDelegation

class Multifunctional (
    impresora: Impresora,
    escaner: Escaner
): Impresora by impresora, Escaner by escaner