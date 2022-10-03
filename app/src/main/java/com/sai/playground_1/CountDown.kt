package com.sai.playground_1

// Given positive integer n implement a function which returns a list containing all steps from n to 0.

fun main() {
    val num = 3
    countDown(num)
}

// my solution
fun countDown(integer: Int) {
    for(i in integer downTo 0) {
        println(i)
    }
}