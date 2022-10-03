package com.sai.playground_1

// Given positive integer n implement a function which returns a list containing all steps up from 0 to n and down to 0.

fun main() {
    val number = 3
    countUpDown(number)
}

// my solution
fun countUpDown(number : Int) {
    for (i in 0..number) {
        println(i)
    }
    for(i in (number-1) downTo 0) {
        println(i)
    }
}