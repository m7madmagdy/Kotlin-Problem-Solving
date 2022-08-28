package codeWars.kyu7


// Link: https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/train/kotlin

fun main() {
    val age = "9 years old"
    println(getAge(age))
}

// Solving
fun getAge(yearsOld: String): Int {
    return yearsOld[0].digitToInt()
}