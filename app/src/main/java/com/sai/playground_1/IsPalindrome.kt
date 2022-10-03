package com.sai.playground_1

/*
Given a string, return true if the string is a palindrome or false if it is not.
Palindromes are strings that form the same word if it is reversed.
Include spaces and punctuation in determining if the string is a palindrome.
*/

fun main() {
    val str = "namias saiman"
    val result = isPalindrome(str)
    println(result)
}

// solution 1 - my solution - reversing it by my own
/*fun isPalindrome(str : String) : Boolean {
    var reverse = ""

    for (i in str.length -1 downTo 0) {
        reverse += str[i]
    }
    if (reverse == str) {
        return true
    }
    return false
}*/

// solution 2 - my solution - using .reversed()
/*fun isPalindrome(str: String) : Boolean {
    val reverse = str.reversed()

    if(str == reverse) {
        return true
    }

    return false
}*/

//solution 3 - just returning with .reversed() - solution I liked
/*fun isPalindrome(str: String) : Boolean {
    return str == str.reversed()
}*/

// solution 4 - double pointer
/*fun isPalindrome(str: String) : Boolean {
    var leftIndex = 0
    var rightIndex = str.lastIndex

    while (leftIndex <= rightIndex) {
        val leftValue = str[leftIndex]
        val rightValue = str[rightIndex]

        if(leftValue != rightValue) {
            return false
        }

        leftIndex++
        rightIndex--
    }

    return true
}*/

// solution 5 - recursive
fun isPalindrome(str: String) : Boolean {
    return if (str.isEmpty() || str.length == 1) {
        true
    } else {
        if (str.first() == str.last()) {
            isPalindrome(str.substring(1 until str.lastIndex))
        } else {
            false
        }
    }
}