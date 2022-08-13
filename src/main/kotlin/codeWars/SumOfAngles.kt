package codeWars

//Link: https://www.codewars.com/kata/5a03b3f6a1c9040084001765/train/kotlin

fun main() {
    print(
        angle(5)
    )
}

fun angle(n: Int): Int {
    // n is the number of side of the polygon
    return (n - 2) * 180
}