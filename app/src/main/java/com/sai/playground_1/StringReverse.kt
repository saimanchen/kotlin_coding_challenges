package com.sai.playground_1

// Given a string implement a function which returns a reversed copy of that string.

fun main() {
    val str = "hello everyone!"
    val reverse = stringReverse(str)
    println(reverse)
}

// reverse word func - last index
fun stringReverse(str: String) : String {
    var reverse = ""
    for (i in str.length - 1 downTo 0) {
        reverse += str[i]
    }
    return reverse
}