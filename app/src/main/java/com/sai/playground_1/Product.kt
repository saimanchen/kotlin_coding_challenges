package com.sai.playground_1

// Given a list of integers implement a function which returns the product of all numbers in the list.

fun main() {
    val list = listOf(3, 4, 10)
    val result = product(list)
    println(result)
}

// solution 1 - my solution - iterative
/*fun product(list: List<Int>) : Int {
    var total = 1
    for (i in list) {
        total *= i
    }
    return total
}*/

// solution 2 - my solution - iterative forEach
/*fun product(list: List<Int>) : Int {
    var total = 1
    list.forEach { total *= it }
    return total
}*/

// solution 3 - recursion - solution I liked
fun product(list: List<Int>): Int {
    if (list.size == 1) {
        return list.first()
    }
    return list.first() * product(list.drop(1))
}