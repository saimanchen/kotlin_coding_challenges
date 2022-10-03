package com.sai.playground_1

// Given a string implement a function which capitalizes first letter of every word in that string.

fun main() {
    val sentence : String = "my name is saiman"
    capitalizeSentence(sentence)
}

// my solution
fun capitalizeSentence(sentence : String) {

    //solution 1 - idiomatic
    val capitalizedSentence = sentence
        .split(" ")
        .joinToString(" ")
        { it.replaceFirstChar(Char::uppercase)}
    println(capitalizedSentence)
}