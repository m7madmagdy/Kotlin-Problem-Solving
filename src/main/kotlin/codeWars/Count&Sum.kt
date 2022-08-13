package codeWars


// Count of positives / sum of negatives

// Link: https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/kotlin


fun main() {
    print(countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, 15)))
}


// Solution
fun countPositivesSumNegatives(input: Array<Int>?) =
    if (input.isNullOrEmpty()) { emptyArray() }
    else arrayOf(input.count { it > 0 }, input.filter { it <= 0 }.sum())
