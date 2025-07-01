import java.io.InvalidClassException

fun main(){
    menoroMayor()
    calificationEval()
    Simulation()
    paroImpar()
    loginAttempt()
    temperature()
    nullableName()
}

//Ejercicio1
fun menoroMayor(){
    var edad: Int = 24

    edad = 16

    if (edad < 18){
        println("Menor de edad!")
    }
    else{
        println("Mayor de edad!")
    }

}

//Ejercicio 2
fun calificationEval(){
    //Esa sera mi nota lol
    val calification = 98
    when(calification){
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }
}

//Ejercicio 3
fun Simulation(){
    var light = "Rojo"

    when(light){
        "Rojo" -> println("Alto")
        "Amarillo" -> println("Precaucion")
        "Verde" -> println("Vamos!")
        else -> println("Color de luz no valido!")
    }
}

//Ejercicio 4
fun paroImpar(){
    val miPar = 45
    if((miPar%2)==0){
        println("Ese numero es par!")
    }
    else{
        println("Ese numero es impar!")
    }
}

//Ejercicio 5
fun loginAttempt(){
    val savedUserName = "admin"
    val savedPassword = 1234

    var enteredUserName = "Jose"
    var enteredPassword = 1234

    if ((savedUserName == enteredUserName) && (savedPassword == enteredPassword)){
        println("Login successfull!")
    }
    else if((savedUserName == enteredUserName) && (savedPassword != enteredPassword)){
        println("Incorrect Password!")
    }
    else if((savedUserName != enteredUserName) && (savedPassword == enteredPassword)){
        println("Incorrect Username!")
    }
    else{
        println("No matches, intenta de nuevo!")
    }
}

//Ejercicio 6
fun temperature(){
    val actualTemperature  = 34.4

    when {
         actualTemperature < 0.0-> println("Freezing! Wear very warm clothes.")
         actualTemperature in 0.0..10.0 -> println("Cold. Wear a warm jacket.")
         actualTemperature in 11.0..20.0 -> println("Cool. A light jacket should be fine.")
         actualTemperature in 21.0..30.0 -> println("Warm. Enjoy the weather.")
         actualTemperature > 30.0-> println("HOt! Stay Hydrated.")
         else -> println("Stay safe buddy!")
    }
}

//Ejercicio 7
fun nullableName(){
    var userName: String? = null
    userName = "Alice"

    if(userName != null){
        println("Hello, $userName!")
    }
    else{
        println("Hello, guest!")
    }
}