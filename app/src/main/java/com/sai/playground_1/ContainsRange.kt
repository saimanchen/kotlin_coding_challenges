package com.sai.playground_1

/*
Given two ranges implement a function which checks if range1 contains range2.
*/

fun main() {
    val numbers1 = listOf(1,2,3,4,5)
    val numbers2 = listOf(2,4,5, 3)
    containsNumbers(numbers1, numbers2)

/*    val range1 = 1..8
    val range2 = 2..9*/

    /*val containsRange = containsRange(range1, range2)
    println(containsRange)*/
}

// solution with lists of numbers, this wasn't the challenge
fun containsNumbers(list1 : List<Int>, list2: List<Int>) {
    println(list1.containsAll(list2))
}
// solution for integer range1 contains range2 or not
/*
fun containsRange(rangeParam1: IntRange, rangeParam2: IntRange) =
    rangeParam2.first >= rangeParam1.first && rangeParam2.last <= rangeParam1.last*/
