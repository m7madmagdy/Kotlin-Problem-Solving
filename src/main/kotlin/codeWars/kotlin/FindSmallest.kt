package codeWars

// Link : https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/kotlin

fun main() {
    print(
        findSmallestInt(listOf(4, 2, 3, 45, 5))
    )
}

//Solution
fun findSmallestInt(nums: List<Int>): Int {
    return nums.minOf {
        it
    }
}
