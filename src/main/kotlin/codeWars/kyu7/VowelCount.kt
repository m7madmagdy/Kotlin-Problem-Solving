package codeWars.kyu7

// Link: https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/kotlin

fun main() {
    print(
        getCount("aeiou")
    )
}

// Solving
fun getCount(str: String): Int {
    return str.count {
        it in "aeiou"
    }
}