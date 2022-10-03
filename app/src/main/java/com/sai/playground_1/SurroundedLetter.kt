package com.sai.playground_1

// Given a string containing letters and + characters implement a function which determines if each letter in the string is surrounded by + character.
// There may be more than one + character between letters (+a++b+) and letters may be surrounded by the same + character (+a+b+).

fun main(){
    val str: String = "&a@*a+"
    val surroundedLetter = surroundedLetter(str)
    println(surroundedLetter)
}

fun surroundedLetter(str: String) : Boolean {
    if(str.length < 3) {
        return false
    }

    if(str.first().isLetter() || str.last().isLetter()) {
        return false
    }

    var prevCharacter = str.first()
    for (currCharacter in str.drop(1)) {
        if (currCharacter.isLetter() && prevCharacter.isLetter()) {
            return false
        }
        prevCharacter = currCharacter
    }
    return true
}