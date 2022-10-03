package com.sai.playground_1

import kotlin.math.pow

// Given positive integer base and positive integer exponent implement a function which calculates power of base of exponent.
// This function should mimic functionality of Math.pow.

fun main() {
    val base = 3
    val exponent = 10
    val result = power(base, exponent)
    println(result)
}

// solution 1 - my solution
fun power(base: Int, exponent: Int) : Int {

    // okay to delete this condition, but if exponent == 1,
    // keep it for better performance?
    if(exponent == 1) {
        return base
    }

    var product = base
    for (i in 1 until exponent) {
        product *= base
    }
    return product
}

// solution 2 - recursive call
/*fun power(base: Int, exponent: Int): Int {
    if (exponent == 1) {
        return base
    }
    return base * power(base, exponent - 1)
}*/

// solution 3 - using .pow()
/*fun power(base: Int, exponent: Int) : Int {
    return base.toDouble().pow(exponent).toInt()
}*/