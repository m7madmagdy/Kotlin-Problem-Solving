package codeWars.kyu8


// Link: https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/kotlin

fun main() {
    print(
        removeChar("Hello")
    )
}

// Solving
fun removeChar(str: String): String {
    return str.substring(1, str.length - 1)
}