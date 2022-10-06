package com.sai.playground_1
import kotlin.math.floor

/*
DESCRIPTION:
Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A, and furthermore has not finished her cabbage.

When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will it take B to catch A?

More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?

The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.

If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, Pascal, COBOL, Erlang, [-1, -1, -1] for Perl,[] for Kotlin or "-1 -1 -1".

EXAMPLES:
(form of the result depends on the language)
race(720, 850, 70) => [0, 32, 18] or "0 32 18"
race(80, 91, 37)   => [3, 21, 49] or "3 21 49"
*/

fun main() {
    println(tortoiseRacing(80, 91, 37))
}

fun tortoiseRacing(v1: Int, v2: Int, g: Int): IntArray {
    if(v1 >= v2) {
        return intArrayOf()
    }
    var count = 0.0

    var isTurtle1Leading = true
    var feetPerMilliSecond1 = v1/60.0/60.0/1000.0
    var feetPerMilliSecond2 = v2/60.0/60.0/1000.0

    var turtle1Distance = g.toDouble()
    var turtle2Distance = 0.0

    while (isTurtle1Leading) {
        turtle1Distance += feetPerMilliSecond1
        turtle2Distance += feetPerMilliSecond2
        count += 1.0
        if(turtle2Distance >= turtle1Distance) {
            isTurtle1Leading = false
        }
    }

    val hours = floor((count/60.0/60.0/1000.0) % 24.0)
    val minutes = floor(count/1000.0/60.0 % 60.0)
    val seconds = floor((count/1000.0) % 60.0)

    return intArrayOf(hours.toInt(), minutes.toInt(), seconds.toInt())
}
