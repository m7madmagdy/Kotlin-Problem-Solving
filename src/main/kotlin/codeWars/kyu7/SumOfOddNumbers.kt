package codeWars.kyu7


// Link: https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/kotlin

// Solution Link(JavaScript): https://dev.to/khwilo/code-kata-calculate-the-sum-of-consecutive-odd-numbers-358o

fun main() {
    print(
        rowSumOddNumbers(5)
    )
}

fun rowSumOddNumbers(n: Int): Int {
    val firstOddNumberOfRow = (0 until n).sum() + 1

    return (firstOddNumberOfRow until firstOddNumberOfRow + n).sumOf {
        2 * it - 1
    }
}