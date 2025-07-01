package LibroData

fun main(){
    libros3()
}

fun libros3(){
    var libro1 = Libro("Quatros acuerdos", "Foucault", "1233-KN2")
    var libro = Libro("Quatros acuerdos", "Foucault", "1233-KN2")
    var libro2 = Libro("Le monde sans toi", "Gerrard De villiers", "133-KN2")
    var libro3 = Libro("Mama", "Montesquieu", "12903-KN2")

    var equality = libro1 == libro
    println("Esos libros son iguales $equality")

    println(libro2)

    libro3 = libro1.copy("Cuatros acuerdos")
    println("Datos del libro 3")
    print(libro3)
}