package codeWars.kyu8

// Link: https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/kotlin


fun main() {
    val result = countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15))
    result.forEach {
        print(it) // [10, -65]
    }
}


// Count of positives / sum of negatives

// Solution
fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
    return if (input.isNullOrEmpty())
        emptyArray()
    else
        arrayOf(input.count { it > 0 }, input.filter { it <= 0 }.sum())
}



