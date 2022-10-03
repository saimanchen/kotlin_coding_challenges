package com.sai.playground_1

/*
Given positive integer n implement a function, which returns a factorial of that integer.
Factorial (of positive integer) is number that is created by multiplying all numbers from 1 to n eg. factorial of 3 (3!) is equal to 6 (3 * 2 * 1)
*/

fun main() {
    val number = 10
    val result = factorial(number)
    println(result)
}

// solution 1 - my own solution - iterative for()
/*fun factorial(number: Int) : Int {
    var total = 1

    for (i in number downTo 1) {
        total *= i
    }
    return total
}*/

// solution 2 - iterative forEach
/*fun factorial(number: Int) : Int {
    var total = 1

    (1..number).forEach { total *= it }

    return total
}*/

// solution 3 - another iterative .reduce { acc, it -> acc * it}
/*fun factorial(number: Int) : Int {
    return when(number) {
        0 -> 1
        else -> (number downTo 1).reduce { acc, it -> acc * it}
    }
}*/

// solution 4 - recursive call
fun factorial(number: Int) : Int {
    return when (number) {
        0 -> 1
        else -> number * factorial(number - 1)
    }
}