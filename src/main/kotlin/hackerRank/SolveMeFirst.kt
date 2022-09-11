package hackerRank

import java.util.*

//Link: https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true

fun solveMeFirst(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}