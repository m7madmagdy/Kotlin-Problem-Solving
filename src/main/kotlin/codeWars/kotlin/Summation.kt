package codeWars

// Link: https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/kotlin

fun main() {
    print(
        summation(4)
    )
}

fun summation(n: Int): Int {
    return (1..n).sum()
}
