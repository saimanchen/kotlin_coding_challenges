package com.sai.playground_1

/*
Given a string, return true if the string is a palindrome or false if it is not.

Palindromes are strings that form the same word when reversed (including spaces and punctuation).

In this exercise one bad character is allowed. The string will be (tolerant) palindrome if after removing one character string is a palindrome.
*/

/*fun main() {
    val str = "saimannias" // saimannias returns true - not correct
    val result = isTolerantPalindrome(str)
    println(result)
}*/

// solution 1 - iterative - not fully correct!
/*private fun isTolerantPalindrome(str: String): Boolean {
    var characterRemoved = false

    str.forEachIndexed { index, c ->
        var lastIndex = str.lastIndex - index

        if (characterRemoved) {
            lastIndex--
        }

        if (index >= lastIndex) {
            return true
        }

        if (c != str[lastIndex]) {
            if (characterRemoved) {
                return false
            } else {
                characterRemoved = true
            }
        }
    }

    return false
}*/

// solution 2 recursive solution - not fully correct!
/*private fun isTolerantPalindrome(str: String, characterRemoved: Boolean = false): Boolean {
    return if (str.isEmpty() || str.length == 1) {
        true
    } else {
        if (str.first() == str.last()) {
            isTolerantPalindrome(
                str.substring(1 until str.lastIndex),
                characterRemoved
            )
        } else {
            if (characterRemoved) {
                false
            } else {
                if (str.length == 2) {
                    return true
                }

                //println(str)
                val removeLeftResult = isTolerantPalindrome(
                    str.substring(2 until str.lastIndex),
                    true
                )
                val removeRightResult = isTolerantPalindrome(
                    str.substring(1 until str.lastIndex - 1),
                    true
                )

                return removeLeftResult || removeRightResult
            }
        }
    }
}*/

/*private fun isTolerantPalindrome(str: String, characterRemoved: Boolean = false): Boolean {
    val revStr = str.reversed()
    if (revStr == str) return true
    if (characterRemoved) return false

    // Remove a single non matching character and re-compare
    val removeIndex = str.commonPrefixWith(revStr).length
    if (removeIndex + 1 > str.length) return false // reached end of string
    val reducedStr = str.removeRange(removeIndex, removeIndex + 1)
    return isTolerantPalindrome(reducedStr, true)
}*/
