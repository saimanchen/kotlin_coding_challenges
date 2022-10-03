package com.sai.playground_1

// Given a list of integers return a list that contains only odd integers (only integers which are not a multiple of 2).

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    val result = getOdd(numbers)
    println(result)
}

// recursive getOdd
fun getOdd(list: List<Int>) : List<Int> {
    if (list.isEmpty()) {
        return list
    }

    return if (list.first() % 2 == 1) {
        mutableListOf(list.first()) + getOdd(list.drop(1))
    } else {
        getOdd(list.drop(1))
    }
}

/*fun getOdd(numbers: ArrayList<Int>) {
    for (number in numbers) {
        if(number % 2 == 1) {
            println(number)
        }
    }
}*/