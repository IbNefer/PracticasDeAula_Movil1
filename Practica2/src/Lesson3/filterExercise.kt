package Lesson3

fun main(){
    listSpices()
    someSpices()
}

fun listSpices(){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    var listCurry = mutableListOf<String>()
    for (element in spices){

        if(element.contains("curry")){
            listCurry.add(element)
        }else{
            println("This $element is not a curry.")
        }
    }

    println(listCurry)

}

fun someSpices(){
    val spices1 = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    var listCurry1 = mutableListOf<String>()

    for (element in spices1) {

        if (element.startsWith("c") && element.endsWith("e")){
            listCurry1.add(element)
        }

    }

    println(listCurry1)
}