package com.sai.playground_1

/*
Given list of strings representing train station names implement a function which will return passenger friendly String:

String always starts with Train is calling at
If list contains single train station name, then return Train is calling at stationName
If list contains multiple train station names, then return comma separated station names, but the last two names are separated by and word.
*/

fun main() {
    val route1 = listOf("Stockholm")
    val route2 = listOf("Stockholm", "Göteborg")
    val route3 = listOf(
        "Stockholm", "Södertälje", "Norrköping",
        "Linköping", "Nässjö", "Alvesta",
        "Hässleholm", "Eslöv", "Lund", "Malmö")
    val route4 = listOf<String>()

    val result = trainRoute(route3)
    println(result)
}

// solution 1 - my solution
fun trainRoute(route : List<String>) : String {
    val prefix = "Train is calling at "


    if(route.isEmpty()){
        return "There's no trip."
    } else if(route.size == 1){
        return "$prefix${route.last()}."
    }

    val lastDestination = route.last()

    val destinations = route.dropLast(1).joinToString { it }
    return "$prefix$destinations and $lastDestination"

}