package com.sai.playground_1

// Given list of strings implement a recursive function which will capitalize first letter of each string in the list.

fun main() {
    val list = listOf("saiman", "hodan", "ather", "jackie", "marina")
    //val list = listOf<String>()
    val result = capitalizeFirst(list)
    //println(result)
}

// my solution
fun capitalizeFirst(list: List<String>) : List<String> {
    val newList = mutableListOf<String>()
    list.forEach { newList += it.replaceFirstChar(Char::uppercase) }
    return newList
}

// the solution I liked
/*
fun capitalizeFirst(list: List<String>) : List<String> {
    return list.map { it.replaceFirstChar(Char::uppercase) }
}*/
