package codeWars.kotlin


// Link: https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/train/kotlin

fun main() {
    println(evenOrOdd(7))
}

//Solution
fun evenOrOdd(number: Int): String {
    return if (number % 2 == 0)
        "Even"
    else
        "Odd"
}