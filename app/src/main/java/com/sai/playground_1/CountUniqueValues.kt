package com.sai.playground_1

// Given a sorted list of integers implement a function which counts the unique values.

fun main() {
    val numberList = listOf(8,2,1,3,4,5,6,6,1,7,8)
    val result = countUniqueValues(numberList)
    println(result)
}

// my solution
/*fun countUniqueValues(list: List<Int>) : Int {
    val newNumberList = mutableListOf<Int>()
    for (i in list) {
        if(newNumberList.contains(i)) {
            continue
        } else {
            newNumberList.add(i)
        }
    }

    return newNumberList.size
}*/

// solution 2 - toSet() - I think this method deletes (filter out?) all duplicates
/*fun countUniqueValues(list: List<Int>) : Int {
    //println(list.toSet())
    return list.toSet().size
}*/

// solution 3 - distinct() - I think this method deletes (filter out?) all duplicates
/*fun countUniqueValues(list: List<Int>) : Int {
    //println(list.distinct())
    return list.distinct().size
}*/

// solution 4 - groupBy - this method groups duplicates
fun countUniqueValues(list: List<Int>) : Int {
    //println(list.groupBy { it })
    return list.groupBy { it }.count() // .size works too
}