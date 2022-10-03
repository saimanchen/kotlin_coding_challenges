package com.sai.playground_1

/*

Given a string representing constant name (upper case words separated by underscore eg FOO_BAR) implement a function which converts it into variable name (eg. fooBar):

convert first word to lowercase
convert next words to lowercase, but first character is still uppercase
remove all underscore characters

decapitalizeConst("FOO") // foo

decapitalizeConst("FOO_BAR") // fooBar

decapitalizeConst("__FOO_BAR_BAZ") // fooBarBaz
* */

fun main() {
    val sentence = "___FOO___BAR_BAZ___JAZZ_"
    val result = decapitalizeConst(sentence)
    println(result)
}

// solution 1 - my solution
/*fun decapitalizeConst(sentence: String): String {
    var str = ""

    val sentenceSplit =
        sentence.split("_")
        .map { it.lowercase().replaceFirstChar(Char::uppercase) }
            .forEach { str += it }

    return str.replaceFirstChar(Char::lowercase)
}*/

// solution 2 - similar to mine, but using
// .joinToString instead of forEach
fun decapitalizeConst(sentence: String) : String {
    val subStringList = sentence.split("_")
        .map { it.lowercase().replaceFirstChar(Char::uppercase)}

    return subStringList.joinToString("").replaceFirstChar(Char::lowercase)
}