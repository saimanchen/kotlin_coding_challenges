package com.sai.playground_1

// Given a positive integer n implement a function which returns a list representing the generated steps with n levels using the # character.
// Make sure the step has appropriate number of spaces on the right hand side!

fun main() {
    val number = 3
    steps(number)
}

// my solution
private fun steps(number: Int) {
    val list = List(number) { "#".repeat(it + 1) + " ".repeat(number - it - 1)}
    for (i in list) {
        println("'$i'")
    }
}