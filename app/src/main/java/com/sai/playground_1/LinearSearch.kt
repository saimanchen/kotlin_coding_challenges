package com.sai.playground_1

// Instructions
// Given list of strings and a string return index of
// the value in the list or -1 if value was not found.

// Limitations
// Don't use any Kotlin build-in methods that are directly
// returning index of element like:
// indexOf / lastIndexOf / indexOfFirst / indexOfLast, etc.

fun main() {
    val charList = listOf<String>("A", "B", "C", "D", "E", "F")
    val char = "D"

    val result = linearSearch(charList, char)
    println(result)
}

// my solution
fun linearSearch(list: List<String>, char: String) : Int {

    list.forEachIndexed { index, element ->
        if (element == char) {
            return index
        }
    }
    return -1
}