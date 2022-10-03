package com.sai.playground_1

/*
The two oldest ages function/method needs to be completed.
It should take an array of numbers as its argument and return the two highest numbers within the array.
The returned value should be an array in the format [second oldest age,  oldest age].

The order of the numbers passed in could be any order. The array will always include at least 2 items.
If there are two or more oldest age, then return both of them in array format.
*/

private fun main() {
    println(twoOldestAges(listOf(1, 2, 3, 4, 5, 6, 7)))
}

// my solution
/*fun twoOldestAges(ages: List<Int>): List<Int> {
    val sortedAges = ages.sortedByDescending { it }
    return listOf<Int>(sortedAges.elementAt(0), sortedAges.elementAt(1))
}*/

// solution I liked
fun twoOldestAges(ages: List<Int>): List<Int> {
    return ages.sorted().takeLast(2)
}

