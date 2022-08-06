package codeWars.kotlin


//Link: https://www.codewars.com/kata/55cbc3586671f6aa070000fb/train/kotlin

fun main() {
    print(
        checkForFactor(6, 3)
    )
}


// Solution
fun checkForFactor(base: Int, factor: Int): Boolean {
    return base % factor == 0
}