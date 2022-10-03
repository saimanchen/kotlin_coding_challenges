package com.sai.playground_1

// Given positive integer n and integer step implement a function which returns a list representing all numbers from n to 1 taking step into consideration.
// If n value is zero then empty list should be returned.

fun main() {
    val number = 11
    val step = 2
    val result = printNumbersStep(number, step)
    println(result)
}

// solution 1 - my solution
/*fun printNumbersStep(numberParam: Int, stepParam: Int) : List<Int> {
    val numberList = mutableListOf<Int>()

    for (i in numberParam downTo 1 step stepParam) {
        numberList.add(i)
    }

    return numberList
}*/

// solution 2 - .toList() - solution I liked
fun printNumbersStep(numberParam: Int, stepParam: Int) : List<Int> {
    return (numberParam downTo 1 step stepParam).toList()
}