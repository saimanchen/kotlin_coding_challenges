package com.sai.playground_1

/*
Task
Given a Divisor and a Bound , Find the largest integer N , Such That ,

Conditions :
- N is divisible by divisor
- N is less than or equal to bound
- N is greater than 0.
* */

fun main() {
    val word = "12345678"

    println(getMiddle(word))
}

fun getMiddle(word : String) : String {
    if(word.length == 1) {
        return word
    }

    return if (word.length % 2 == 0) {
        word[(word.length / 2) -1].toString() + word[(word.length / 2)].toString()
    } else {
        word[word.length / 2].toString()
    }
}