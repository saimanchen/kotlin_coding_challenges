package com.sai.playground_1

// You are given an array (which will have a length of at least 3, but could be very large) containing integers.
// The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
// Write a method that takes the array as an argument and returns this "outlier" N.

fun main() {
    println(findParityOutlier(arrayOf(2, 4, 0, 100, 4, 11, 2602, 36)))
}

// my solution
fun findParityOutlier(integers: Array<Int>): Int {
    var array1: ArrayList<Int> = arrayListOf()
    var array2: ArrayList<Int> = arrayListOf()
    integers.forEach {
        if(it % 2 == 0) {
            array1.add(it)
        } else {
            array2.add(it)
        }
    }
    return if(array1.size == 1) {
        array1[0]
    } else {
        array2[0]
    }
}

// solution I liked
/*
fun findParityOutlier(integers: Array<Int>): Int {
    val evens = integers.filter { it % 2 == 0 }
    val odds = integers.filter { it % 2 != 0 }
    return if(evens.size == 1){
        evens.first()
    }else{
        odds.first()
    }
}*/
