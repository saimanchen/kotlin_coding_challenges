package com.sai.playground_1

// Given a string implement a function which returns longest word in that string.
// If there are two or more words that have the same length, return the first longest word from the string.
// Ignore punctuation. Input string can't be empty or blank sering.

fun main() {
    val sentence = "Hello everyone live abcdefgh 12345678 11111111"
    longestWord(sentence)
}
// my solution
fun longestWord(sentence: String) {
    val wordList = sentence.split(' ')
    var temp = ""
    var concTemp = ""
    var longestWords = ""

    for(word in wordList) {
        if(word.length > temp.length) {
            concTemp = ""
            temp = word
            concTemp = "$temp "
        } else if(temp.length == word.length) {
            temp = word
            concTemp += "$temp "
        }
    }

    longestWords = concTemp

    val longestWordsList = longestWords.split(" ")
    for(word in longestWordsList) {
        if(word == "") {
            break
        } else {
            println(word)
        }
    }
}