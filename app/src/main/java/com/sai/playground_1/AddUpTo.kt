package com.sai.playground_1

// Given positive integer n implement a function which calculates sum of all numbers from 1 up to (and including) number n.

fun main() {
    val number = 5
    val sum = addUpTo(number)

    println(sum)
}

// my solution
fun addUpTo(num: Int) : Int {
    var sum = 0
    for(i in 1..num) {
        sum += i
    }
    return sum
}

// the solution I liked
/*
private object Solution3 {
    private fun addUpTo(n: Int): Int {
        if (n == 1) {
            return 1
        }

        return n + addUpTo(n - 1)
    }
}*/
