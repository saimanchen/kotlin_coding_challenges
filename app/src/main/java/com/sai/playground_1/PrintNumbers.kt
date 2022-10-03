package com.sai.playground_1

// Given positive integer n implement a function which returns a list representing all numbers from n to 1.
// If n value is zero then empty list should be returned.

fun main() {
    val number = 3
    val result = printNumbers(number)
    print("$result, { B O O M }")
}

// solution 1 - my solution
/*fun printNumbers(number: Int) : List<Int> {
    val numberList = mutableListOf<Int>()

    for (i in number downTo 1) {
        numberList.add(i)
    }

    return numberList
}*/

// solution 2 - .toList() - makes a list - BEST solution?
fun printNumbers(number: Int) : List<Int> {
    return (number downTo 1).toList()
}
