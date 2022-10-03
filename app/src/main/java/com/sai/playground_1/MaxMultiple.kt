package com.sai.playground_1

/*
Task
Given a Divisor and a Bound , Find the largest integer N , Such That ,

Conditions :
N is divisible by divisor

N is less than or equal to bound

N is greater than 0.
*/

fun main() {
    println(maxMultiple(543, 7873291))
}


// my solution
/*
fun maxMultiple(d: Int, b: Int): Int {
    for(i in b downTo 0) {
        if(i % d == 0) {
            return i
        }
    }
        return -1
}*/

// the solution I liked
fun maxMultiple(d: Int, b: Int): Int {
    for(i in b downTo 0) if(i % d == 0) return i
    return 0
}
