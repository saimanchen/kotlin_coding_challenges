package com.sai.playground_1

// Given an integer n, return an integer that is the reverse ordering of digits.

fun main(){
    integerReverse()
}

// my solution
fun integerReverse() {
    var number = 123
    var reversed = 0

    while (number != 0) {
        val digit = number % 10
        reversed = reversed * 10 + digit
        number /= 10
    }
println(reversed)
}