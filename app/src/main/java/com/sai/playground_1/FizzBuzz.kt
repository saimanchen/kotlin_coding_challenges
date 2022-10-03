package com.sai.playground_1

/*
Given positive integer n implement a function which returns a list numbers from 1 to n.
However for multiples of three list should contain word Fizz instead of the number and for the multiples of five list should contain word Buzz.
For numbers which are multiples of both three and five list should contain FizzBuzz word.
*/

fun main() {
    fizzBuzz(30)
}

fun fizzBuzz(num: Int) {
    for(i in 1..num) {
        when {
            i % 15 == 0 -> {
                println("FizzBuzz")
            }
            i % 3 == 0 -> {
                println("Fizz")
            }
            i % 5 == 0 -> {
                println("Buzz")
            }
            else -> {
                println(i)
            }
        }
    }
}
